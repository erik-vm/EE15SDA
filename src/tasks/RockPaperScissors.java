package tasks;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String randomChoice = "";

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        /*System.out.println("Enter first players choice:");
        String playerOne = scanner.nextLine().toUpperCase();
        System.out.println("Enter second players choice:");
        String playerTwo = scanner.nextLine().toUpperCase();*/

        System.out.println("Choose your weapon! (rock/paper/scissors/spock/lizard");
        String playerOne = scanner.nextLine().toUpperCase();
        String playerTwo = randomChoice();
        System.out.println("Computer chose: " + playerTwo);


       rockPaperScissors.play(playerOne, playerTwo);

        }
public void play(String playerOne, String playerTwo){
    if (playerOne.equals(playerTwo)){
        System.out.println("Its a tie.");
    }else if (playerOne.equals("ROCK") && (playerTwo.equals("SCISSORS") || playerTwo.equals("LIZARD"))||
              playerOne.equals("PAPER") && (playerTwo.equals("ROCK") || playerTwo.equals("SPOCK"))||
              playerOne.equals("SCISSORS") && (playerTwo.equals("PAPER") || playerTwo.equals("LIZARD"))||
              playerOne.equals("LIZARD") && (playerTwo.equals("PAPER") || playerTwo.equals("SPOCK"))||
              playerOne.equals("SPOCK") && (playerTwo.equals("ROCK") || playerTwo.equals("SCISSORS"))) {
        System.out.println("Player won.");
    }else if (playerTwo.equals("ROCK") && (playerOne.equals("SCISSORS") || playerOne.equals("LIZARD"))||
            playerTwo.equals("PAPER") && (playerOne.equals("ROCK") || playerOne.equals("SPOCK"))||
            playerTwo.equals("SCISSORS") && (playerOne.equals("PAPER") || playerOne.equals("LIZARD"))||
            playerTwo.equals("LIZARD") && (playerOne.equals("PAPER") || playerOne.equals("SPOCK"))||
            playerTwo.equals("SPOCK") && (playerOne.equals("ROCK") || playerOne.equals("SCISSORS"))){
        System.out.println("CPU two won.");
    }else {
        System.out.println("Invalid answer.");
    }
}

public static String randomChoice(){
    Random random = new Random();
    int choice = random.nextInt(5)+1;
    switch (choice){
        case 1 : randomChoice = "ROCK";
        break;
        case 2 : randomChoice = "PAPER";
        break;
        case 3 : randomChoice = "SCISSORS";
        break;
        case 4 : randomChoice = "LIZARD";
        break;
        case 5 : randomChoice = "SPOCK";
        break;
    }
    return randomChoice;
}
    }

