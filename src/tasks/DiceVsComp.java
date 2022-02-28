package tasks;

import java.util.Scanner;

public class DiceVsComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many round do you want to play?");

        int rounds = scanner.nextInt();
        int userScore= 0;
        int comScore = 0;

        for (int i = 0; i<rounds; i++){
            int userRoll = (int) (Math.random()*7);
            int comRoll = (int) (Math.random()*7);

            if (userRoll>comRoll){
                userScore++;
            } else if (comRoll > userRoll) {
                comScore++;
            }
        }
        if (userScore>comScore){
            System.out.println("Congrats! You won!");
            System.out.println("Your score is: " + userScore + " and computers score is: " + comScore);
        }else if(userScore<comScore){
            System.out.println("Sorry! You lost!");
            System.out.println("Your score is: " + userScore + " and computers score is: " + comScore);
        }else {
            System.out.println("Its a tie!");
            System.out.println("Your score is: " + userScore + " and computers score is: " + comScore);
        }

    }
}