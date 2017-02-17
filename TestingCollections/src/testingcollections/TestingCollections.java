/*
 * This file is for the class CIT 360 to demonstrate the difference
 * between a regular array in Java and the Java Collections.
 */
package testingcollections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/**@author josecovarrubias*/
public class TestingCollections {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** This displays a regular array in Java **");
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
//        System.out.println(regArray);
        /*This will print everything on the array. If I want to add more stuff
        to this array I will have to modify the array's index number on line 18
        and also add the new value to the actual array, or add a new method and
        receive new input from the user to be added to the array*/ 
        for(int i:regArray){
        System.out.print(i);
        System.out.println();}
////////////////////////////////////////////////////////////////////////////////
        /*              COLLECTION LIST         */
       System.out.print("\n** Collections LIST **");       
       /*Different from regular arrays, collections can be a lot more simple
         and complex at the same time. For example a List can hava duplicates
         of the data in it as long is the same type of data. 
         It means that I can have 2 or more of the same thing, as shown  here.*/
        List stuff = new ArrayList();
        //data stored in the List collection.
        stuff.add("car3");
        stuff.add("car1");
        stuff.add("car4");
        stuff.add("car4");
        //this displays the list.
        System.out.println();
        System.out.println(stuff);
        // Creating the comparator you give the SORT method the value to 
        // sort the list.
        Comparator sortStuff = null;
        stuff.sort(sortStuff); 
        System.out.println("was the new value added? "+stuff.add("car6"));
        System.out.println(stuff);
////////////////////////////////////////////////////////////////////////////////
        /*              COLLECTION SET 
        A collection Set can have different types of data as shown here,
        but they cannot repeat. This could be helpful whe working with arrays
        that require that data is enter only once. 
        */
        System.out.print("\n** Collection SET **"); 
        Set colSet = new HashSet();
        colSet.add(2);
        colSet.add("bike");
        colSet.add(3.5);
        
        System.out.println();
        System.out.println(colSet);
        System.out.println("#of index "+colSet.size());
        System.out.println();
        System.out.println("== Displaying same colSet array with ITERATOR ==");
        Iterator colIterator = colSet.iterator();
        while(colIterator.hasNext()){
                Object data = colIterator.next();
                System.out.print(data + ", ");}
              
       //Here are some methods that can be used with most collection interfaces
        System.out.println();
        System.out.println("Does this collection SET has 4 values? "+colSet.contains(4)); 
        System.out.println("Is this collection SET empty? "+colSet.isEmpty());
        System.out.println("Was the bike removed from this SET? "+colSet.remove(2));
        System.out.println(colSet);
        
 ///////////////////////////////////////////////////////////////////////////////
        /*             COLLECTION TREESET
        The TREESET is a collction that can sort the array for you. data has
        to be of the same type. Duplicates will not show. */
        System.out.println("\n** NOW USING THE TREESET **");
        TreeSet sortItForMe = new TreeSet();
            sortItForMe.add(305);
            sortItForMe.add(303);
            sortItForMe.add(208);
            System.out.println(sortItForMe);
            
////////////////////////////////////////////////////////////////////////////////
        /*          COLLECTION MAP
        Map collections can function well creating list/arrays 
        that can be used in phone directories or other data lists that 
        need 2 sets of information.*/
        System.out.println("\n** NOW USING THE MAP **");
        Map raceCarNum = new HashMap();
            raceCarNum.put("blue","1");
            raceCarNum.put("red","5");
            raceCarNum.put("black","3");
            raceCarNum.put("pink","8");
            System.out.println("Cars and their Numbers");
            System.out.println(raceCarNum);
            raceCarNum.keySet();
            System.out.println(raceCarNum.entrySet());
    }
    
}
