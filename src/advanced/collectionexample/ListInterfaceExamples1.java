package advanced.collectionexample;

import java.util.ArrayList;

public class ListInterfaceExamples1 {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<String> car = new ArrayList<String>(); //ordered list, can contain duplicated items

        //Add values
        car.add("Volvo");
        car.add("BMW");
        car.add("MB");
        car.add("MB");
        car.add("VW");
        car.add("Ferrari");

        System.out.println(car);

        //Add elements at specific index
        car.add(2,"Ford");
        System.out.println(car);

        //Get elements by index
        System.out.println(car.get(4));

        //Change elements value
        car.set(4, "Opel");
        System.out.println(car);

        //Remove element by index
        car.remove(5);
        System.out.println(car);

        ///Size
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);
    }
}
