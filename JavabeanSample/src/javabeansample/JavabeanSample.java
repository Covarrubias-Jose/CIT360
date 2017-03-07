/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeansample;

import java.util.*;
/**
 *
 * @author josecovarrubias
 */
public class JavabeanSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//   This is a new instance of the BeanSample class, assigning it to 
//   the variable beansAtwork.
        BeanSample beansAtwork = new BeanSample();
        
/*    The variable/property beansAtwork is used to set the values and store 
      them on the BeanSample class.
      *NOTE: the BeanSample class can be reused as many times as you want at 
      this point. If this Javabeans implementation was not used, then you
      would have to type in all of the getters and setters every single time
      you want to create a new instance of the BeanSample class. */
        beansAtwork.setYourName("jose");
        beansAtwork.setYourAge(33);      
        beansAtwork.setYouAmazing(false);
        
        System.out.println("your name is: " + beansAtwork.getYourName());
        System.out.println("your age is: " + beansAtwork.getYourAge());
        System.out.println("Are you amazing? ");
        System.out.println(beansAtwork.isYouAmazing()?"I am" : "You tell me");
////////////////////////////////////////////////////////////////////////////////         
//////////////////////////////////////////////////////////////////////////////// 
//    Here is another sample of the BeanSample class reusing the Serializable
//    interface
        System.out.println("\n");
        System.out.println("//Here is another sample of the BeanSample class\\");
        
        BeanSample beansAgain = new BeanSample();
        beansAgain.setYourName("Joseph");
        beansAgain.setYourAge(23);
        beansAgain.setYouAmazing(true);
        
        System.out.println("your name is: " + beansAgain.getYourName());
        System.out.println("your age is: " + beansAgain.getYourAge());
        System.out.println("Are you amazing? ");
        System.out.println(beansAgain.isYouAmazing()?"I am" : "You tell me");
////////////////////////////////////////////////////////////////////////////////         
////////////////////////////////////////////////////////////////////////////////        
        // Here I'm getting input from user.  
        System.out.println("\n");
        System.out.println("Here I'm getting input from user.");
        // New instance of the class
        BeanSample gettingBeans = new BeanSample();
        // system asks for your name.
        System.out.println("enter your name");
        // sets CPU memory space aside in variable "name" to be used later.
        Scanner name;
        // gets the input from user, it can be anything; String, integer.
        name= new Scanner(System.in);
        // declares that the input value is String/text and pass it to
        // a new variable "nameIs"
        String nameIs = name.nextLine();
        // sends the value to the BeanSample class to be stored.
        gettingBeans.setYourName(nameIs);
        // calls the BeanSample class to get the name that was stored
        // and turns it into uppercase just to distinguis the output.
        System.out.println("Welcome: " + gettingBeans.getYourName().toUpperCase());
        
        // this is an exception handler. This helps the system to indentify
        // problems with the code or the data input.
        try{
        System.out.println("now your age");
        Scanner age = new Scanner(System.in);
        int ageIs = age.nextInt();
        gettingBeans.setYourAge(ageIs);
        System.out.println("your age is: " + gettingBeans.getYourAge());
        }
        catch(Exception e){
        System.out.println("only integers.No text or part numbers.");
        }
    }
    
}
