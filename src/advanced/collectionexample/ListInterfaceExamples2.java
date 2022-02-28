package advanced.collectionexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExamples2 {
    public static void main(String[] args) {

    /*    //ArrayList example 1
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = new ArrayList<Integer>(list);
        // list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println(list2);
*/
    /*    //ArrayList example 2
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");

        arrayList.add(2,"Test 2.1");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        for (String str :arrayList) {
            System.out.print(str + " ");
        }*/

        //LinkedList -- is used if elements are manipulated
        LinkedList<String> car = new LinkedList<String>();
        car.add("Toyota");
        car.add("BMW");
        car.addFirst("MB");
        System.out.println(car);
        System.out.println(car.getLast());
        System.out.println(car.get(1));

        car.removeFirst();
        System.out.println(car);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 1; i<=100; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
    }
}
