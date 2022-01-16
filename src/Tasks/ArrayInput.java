package Tasks;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of an array: ");

        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        int sum = 0;

        for (int i = 0; i < arraySize; i++){
            System.out.println("Please enter " + (i+1) + "'th number to an array.");
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }
        for (int i = 0; i < arraySize; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of the numbers is: " + sum);
    }




}
