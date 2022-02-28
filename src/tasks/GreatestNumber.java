package tasks;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three integers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

//        if (firstNumber > secondNumber && firstNumber > thirdNumber){
//            System.out.println("The largest integer is: " + firstNumber);
//        } else if (secondNumber>thirdNumber){  //the condition that second number is bigger the first one, is already met by passing the first if statement
//            System.out.println("The largest integer is: " + secondNumber);
//        }else {
//            System.out.println("The largest integer is: " + thirdNumber);
//        }

//        int max = Math.max(firstNumber, secondNumber);
//        System.out.println(Math.max(max, thirdNumber));

        System.out.println(Math.max(Math.max(firstNumber,secondNumber),thirdNumber));
    }
}
