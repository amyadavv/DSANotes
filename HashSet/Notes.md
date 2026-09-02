# Set

What is set? 

Set is a type of structure in Math in which if we put different number for example - 1,2,3,4,5,5,1. Then set won't allow duplicates number to add in it. Final set numbers will be - 1,2,3,4,5. So in set every number is unique.

# HashSet in Java

It is important data structure because it reduces time complexity of a program.

1. Insert / Add - O(1)
1. Search / Contains - O(1)
1. Delete / Remove - O(1)


```java

import java,util.HashSet;

public class  Hashing {
    public static void main (String args[]) {
        HashSet <Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
    }
}

```