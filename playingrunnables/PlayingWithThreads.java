/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingrunnables;

/**
 *
 * @author josecovarrubias
 * 
 *  One thing to note about Java threads is that you can only extend one 
 *  class on a project. Also, anytime you use the  "extends Thread" class
 *  all of the new instances created will have the same value, meaning that
 *  the thread constructor will repeat the once the first task has finished.
 */
public class PlayingWithThreads extends Thread{
        private int counter = 0;
    
        @Override
        public void run(){
            counter++;
        System.out.println("Using the Thread. Counter: "+ counter);
        
        /* This bottom part is just another test I was suing with the
           you can uncommented out to see what it does.     */
        
//        for (int i = 0; i < 3; i++) {
//            counter++;
//        System.out.println("Using the Thread. Counter: "+ counter);   
//        }
    }
}
