/*
 * This file is for the class CIT 360 to demonstrate the difference
 * between a regular array in Java and the Java Collections.
 */
package testingcollections;
import java.util.ArrayList;
import java.util.List;
/**@author josecovarrubias*/
public class TestingCollections {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**This displays a regular array in Java**");
        //let's create an commun array in Java name regArray
        int[] regArray;
        //we need to give the array the number of elements/items it will have
        regArray = new int[4];      
        //let's give each index a value, the [] brakets represent
        //the index possition in the array.
        regArray[0]=101;
        regArray[1]=102;
        regArray[2]=103;
        regArray[3]=104;      
        /*This will print everything on the array. If I want to add more stuff
        to this array I will have to modify the array's index number on line 16
        and also add the new value to the actual array, or add a new method and
        receive new input from the user to be added to the array*/ 
        for(int i:regArray){
        System.out.print(i);
        System.out.println();
        
       
    }
       // this is just to separate the arrays 
       System.out.println("================================================"
                         +"\nNow Java collections which are similar to arrays"
                         +"\n================================================");
        
       /*Different from regular arrays, collections can be a lot more simple.
         
       */
        List stuff = new ArrayList();
        //data stored in the List collection.
        stuff.add("car1");
        stuff.add("car2");
        stuff.add("car3");
        stuff.add("car4");
        //this displays the list.
        System.out.println("**Display Stuff list**");
        System.out.println(stuff);
        
        
    }
    
}
