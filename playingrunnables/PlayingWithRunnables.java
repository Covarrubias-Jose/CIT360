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
 *  One of the benefits of "Runnable" is that it can be called several times
 *  on a program, and each time the object created will be a new object,
 *  and if you have multiple objects being created each object is different
 *  from the other, something the "Thread" can't do, because the objects 
 *  created with "Thread" will be the same as the previous one. 
 */

//      Note here that the class uses "implements" rather than "extends"
public class PlayingWithRunnables implements Runnable{
    
//      This is just a variable name "counter"    
    private int counter = 0;
    
//      The "Runnable" interface uses the method "run" to be called and start 
//      executing.    
        @Override
        public void run(){
            counter++;
            System.out.println("Using the Runnable. Counter: "+ counter);
            
/*      This botttom part that is commented out is another test with runnables
            you can uncommented to see what it does.        */  

//        for (int i = 0; i < 3; i++) {
//            counter++;
//        System.out.println("Using the Runnable. Counter: "+ counter);
//        }
    }       
}
