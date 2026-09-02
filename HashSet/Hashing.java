import java.util.HashSet;
import java.util.Iterator;

public class  Hashing {
    public static void main (String args[]) {
        HashSet <Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println("Size is " + set.size());

        System.out.println("Print all elements" + set);

        // Search
        if(set.contains(1)) {
            System.out.println("Contains ");
        }

        if(!set.contains(6)) {
            System.out.println("Does not Contains ");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Does not Contains 1 ");
        }

        // Special Iterator because we cannot use for loop, there is no index of set elements. Used for sets and HashMaps

        Iterator it = set.iterator();




    }
}
