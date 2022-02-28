package tasks;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String quizArray[][] = new String[4][4];
        int correctAnswers[] = {3, 2, 2, 1};
        int score = 0;

        quizArray[0][0] = "Whats the capital of Estonia?";
        quizArray[0][1] = "Elva";
        quizArray[0][2] = "Tartu";
        quizArray[0][3] = "Tallinn";
        quizArray[1][0] = "What is the largest island in Estonia?";
        quizArray[1][1] = "Hiiumaa";
        quizArray[1][2] = "Saaremaa";
        quizArray[1][3] = "Muhu";
        quizArray[2][0] = "What is the tricolor of Estonian flag?";
        quizArray[2][1] = "White and blue";
        quizArray[2][2] = "Blue, black and white";
        quizArray[2][3] = "Black and red";
        quizArray[3][0] = "How many people there live in Estonia?";
        quizArray[3][1] = "1.3M";
        quizArray[3][2] = "3.1M";
        quizArray[3][3] = "13M";

        for (int i = 0; i<quizArray.length; i++){
            System.out.println(quizArray[i][0]);
            for (int j = 1; j<quizArray[i].length; j++){
                System.out.println("\t" + j +") " + quizArray[i][j]);
            }
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]){
                System.out.println("That's correct!");
                score++;
            }else {
                System.out.println("That's wrong!");
            }
        }
        System.out.println("Correct answers: " + score);
    }

}
