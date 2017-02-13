/*
 * This file is for the class CIT 360 to demonstrate the difference
 * between a regular array in Java and the Java Collections.
 */
package testingcollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
        to this array I will have to modify the array's index number on line 18
        and also add the new value to the actual array, or add a new method and
        receive new input from the user to be added to the array*/ 
        for(int i:regArray){
        System.out.print(i);
        System.out.println();
    }//////////////////////////////////////////////////////////////////////////
        /*              COLLECTION LIST         */
       System.out.println("\n**Now Java collections**");       
       /*Different from regular arrays, collections can be a lot more simple
         and complex at the same time. For example a List can hava duplicates
         of the data in it as long is the same type of data. 
         It means that I can have 2 or more of the same thing, as shown  here.*/
        List stuff = new ArrayList();
        //data stored in the List collection.
        stuff.add("car1");
        stuff.add("car2");
        stuff.add("car4");
        stuff.add("car4");
        //this displays the list.
        System.out.println();
        System.out.println(stuff);
        ////////////////////////////////////////////////////////////////////////
        /*              COLLECTION SET 
        A collection Set can have different types of data as shown here,
        but they cannot repeat. This could be helpful whe working with arrays
        that require that data is enter only once. 
        */
        Set colSet = new HashSet();
        colSet.add(2);
        colSet.add("bike");
        colSet.add(3.5);
        System.out.println();
        System.out.println(colSet);
        System.out.print("#of index "+colSet.size()+"\n");
        System.out.println();
        System.out.println("**Displaying same colSet array with ITERATOR**");
        Iterator colIterator = colSet.iterator();
        while(colIterator.hasNext()){
                Object data = colIterator.next();
                System.out.print(data + ", ");
        }
        System.out.println();
    }
    
}
