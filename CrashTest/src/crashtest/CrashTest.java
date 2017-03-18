
package crashtest;

import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class CrashTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // this line displays a message
        System.out.println("ENTER ATTACK LEVEL NUMBER");
        // this line stores the value entered
        Scanner inpVAL = new Scanner(System.in); 
        // this line defines the type of value, it can be String, boolean, double.
        int beast1 = inpVAL.nextInt();
        
        // this line displays a message
        System.out.println("ENTER ATTACK POWER NUMBER");
        // this line stores the value entered
        Scanner powVAL = new Scanner(System.in);
        // this line defines the type of value, it can be String, boolean, double.
        int beast2 = powVAL.nextInt();
        
        // this line creates a new instance of the class Beast
        Beast crazyAnimal = new Beast();
        // this line uses the new instance "crazyAnimal" and calls the class "damagetest"
        // and 2 parameters are pass into it by the variables in the parenthesis. 
        int dead = crazyAnimal.damagetest(beast1, beast2);
        // after the values go through the other class they return and are
        // printed out to the consol or screen. 
        System.out.println(dead + " IS " + beast1 + " RAISED TO THE POWER OF " + beast2);
        
//         for(double resistance=2500; resistance >= dead; resistance++){
             ;
            if (dead >2500){
            System.out.println("\n$$||>> YOU WIN <<||$$");
    
            }else if(dead <2500){
            System.out.println("### ATTACK AGAIN ###");
            
            }
//          }
        }  
}
