package tasks;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum range: ");
        int maxRange = scanner.nextInt();

        System.out.println("Please guess a number between 1-"+maxRange + ":");
        int usersNumber = scanner.nextInt();
        int computersNumber = (int) (Math.random() * (maxRange+1));
        int guessCount = 1;

       while (usersNumber != computersNumber){
           if (usersNumber>computersNumber){
               System.out.println("Try lower number.");
           }else {
               System.out.println("Try higher number.");
           }
            usersNumber = scanner.nextInt();
           guessCount++;
        }
        System.out.println("Congrats! You won!");
        System.out.println("It took you " + guessCount + " guesses.");
    }

}
