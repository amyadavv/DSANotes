# Set

What is set? 

Set is a type of structure in Math in which if we put different number for example - 1,2,3,4,5,5,1. Then set won't allow duplicates number to add in it. Final set numbers will be - 1,2,3,4,5. So in set every number is unique.

# HashSet in Java

It is important data structure because it reduces time complexity of a program.

1. Insert / Add - O(1)
1. Search / Contains - O(1)
1. Delete / Remove - O(1)


```java

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

```

# Iterator

## next
Set = (1,2,3)
Iterator it = set.iterator();

1. First time it is point to null value.
2. it.next() - 1
3. it.next() - 2
4. it.next() - 3

## hasNext

1. It will return true or false 
2. If the next points to some value then it will return true otherwise it will return false.
3. Also the first time the it.next() points to null so in this case hasNext will return true.
4. After 3 if we check hasNext then it will return false.

To print all set elements: 

while(it.hasNext()) {
    print(it.next());
}