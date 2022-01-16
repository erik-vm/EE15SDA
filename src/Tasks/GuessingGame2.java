package Tasks;

import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum range: ");
        int maxRange = scanner.nextInt();
        System.out.println("How many tries?");
        int guessCount = scanner.nextInt();

        System.out.println("Please guess a number between 1-"+maxRange + ":");
        int usersNumber = scanner.nextInt();
        int computersNumber = (int) (Math.random() * (maxRange+1));
        guessCount--;

        while (usersNumber != computersNumber && guessCount>0){
            if (usersNumber>computersNumber){
                System.out.println("Try lower number.");
            }else {
                System.out.println("Try higher number.");
            }

            System.out.println("You have left " + guessCount + " guesses.");
            usersNumber = scanner.nextInt();
            guessCount--;

        }
        if (guessCount ==0){
            System.out.println("You run out of guesses");
            System.out.println("Correct number was: " + computersNumber);
        }else {
            System.out.println("Congrats! You won!");
        }
    }
}
