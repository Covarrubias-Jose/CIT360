/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingrunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author josecovarrubias
 */
public class PlayingRunnables {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        /* Whenever yo want to use a "extends Thread" class you start the same
            way you would with other classes. create a new instance, give it 
            a variable, in this case "Th1" then use the variable and add
            ".start();" that's what will called the thread to start. */
        PlayingWithThreads Th1 = new PlayingWithThreads();
        Th1.start();
        Thread.sleep(500);
        PlayingWithThreads Th2 = new PlayingWithThreads();
        Th2.start();
        Thread.sleep(500);
        PlayingWithThreads Th3 = new PlayingWithThreads();
        Th3.start();

        // the line below slows down the process, it's milliseconds. 
        Thread.sleep(500);
        System.out.println("//////////////////////////////////////////");
        Thread.sleep(500);
        
        
        PlayingWithRunnables Run =new PlayingWithRunnables();
        Thread Run1 = new Thread(Run);
        Run1.start();
        Thread.sleep(500);
        Thread Run2 = new Thread(Run);
        Run2.start();
        Thread.sleep(500);
        Thread Run3 = new Thread(Run);
        Run3.start();
        
////////////////////////////////////////////////////////////////////////////////    
       
        Thread.sleep(500);
        System.out.println("//////////////////////////////////////////");
        Thread.sleep(500);   
        
        Thread.sleep(500);
        System.out.println("Let's use the Executors now.");
        Thread.sleep(500);
               
        // this executor has the variable of "nameIt"
        ExecutorService nameIt = Executors.newFixedThreadPool(3);
        Thread.sleep(500);
        
        // This "for" loop is executed by the main class method
          for (int i = 0; i < 3; i++) {
              System.out.println("A line = "+Thread.currentThread().getName());
               
            Runnable lineExample = new Runnable(){
                @Override
                public void run() {
         
          // This "for" loop is started by the executor.          
          for (int j = 0; j < 3; j++) {
              System.out.println("A new line = "+Thread.currentThread().getName()); 
                    }                                   
                }
            };   /* This is the variable from the executor above, it calls 
                    the "lineExample" variable that starts the "Runnable"
                    */
                 nameIt.execute(lineExample);                        
        }       
                // With executors you have to manualy shutdown it, otherwise 
                // it will keep running on the RAM.
                nameIt.shutdown();
                
               System.out.println("END OF THREAD ");

   }  
}
