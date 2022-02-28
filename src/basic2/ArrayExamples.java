package basic2;

public class ArrayExamples {
    public static void main(String[] args) {


        String[] childNames = new String[3];
        childNames[0] = "Ben";
        childNames[1] = "Tom";

        System.out.println(childNames[0]);
        System.out.println(childNames[1]);
        System.out.println(childNames[2]);

        String[] dreamCars = new  String[]{"BMW", "Audi", "Opel", "Lada"};

        System.out.println(dreamCars[0]);
        System.out.println(dreamCars[1]);
        System.out.println(dreamCars[2]);
        System.out.println(dreamCars[3]);

        //int data type array

        int[] age = new int[4];
        age[0] = 5;
        age[3] = 10;
        age[1] = 14;
        age[2] = 3;

        System.out.println(age.length);

        // loot through all elements in array

        for (int i=0; i < age.length ; i++){
            System.out.println("Element with index " + i + "- " + age[i]);
        }

    }
}
