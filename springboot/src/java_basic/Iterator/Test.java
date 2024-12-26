package java_basic.Iterator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // difference between HashSet and TreeSet
        Set<String> hashSet = new HashSet<>();
        Comparator<String> ageComparator = (p1, p2) -> p2.compareTo(p1);
        Set<String> treeSet = new TreeSet<>(ageComparator);
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Grape");
        hashSet.add("Orange");
        hashSet.add(null);
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Grape");
        treeSet.add("Orange");

        System.out.println("HashSet:");
        for(String x : hashSet){
            System.out.println(x);
        }
        System.out.println("TreeSet:");
        for(String x : treeSet){
            System.out.println(x);
        }

        //

    }
}
