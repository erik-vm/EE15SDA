package advanced.collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
/*

        //HashSet example 1

        Set<String> name = new HashSet<String>();

        //Add elements
        name.add("John");
        name.add("Bob");
        name.add("Liza");
        name.add("Anna");
        name.add("Anna");

        System.out.println(name);  //HashSet does not print out in order. And it prints out unique elements.

        //Remove
        name.remove("Bob");
        System.out.println(name);

        //Size
        System.out.println(name.size());

        //Contains
        System.out.println(name.contains("Bob"));
        System.out.println(name.contains("Liza"));

        //Iterate

        for (String names: name) {   //foreach loop will automatically know how many elements there is in array.
            System.out.println(names + " Mambo number five");
        }
        System.out.println("---------");
        Iterator <String> i = name.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
*/

        //HashSet example 2
        Set<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println(intSet1);

        Set<Integer> intSet2 = new HashSet<Integer>();

        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        //Find union
        Set<Integer> union = new HashSet<Integer>(intSet1);
        System.out.println("Union: " + union);
        union.addAll(intSet2);
        System.out.println("Updated union: " + union);

        //Find intersection
        Set<Integer> intersection = new HashSet<Integer>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println(intersection);

        //Find difference
        Set<Integer> difference = new HashSet<Integer>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("Unique elements in intSet1: "+difference);

        //LinkedHashSet

        Set<String> linkedHashSet = new LinkedHashSet<String >(); //with linked hashset values are in order
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Finland");
        linkedHashSet.add("Finland");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Poland");
        linkedHashSet.add("Russia");
        System.out.println(linkedHashSet);

    }
}
