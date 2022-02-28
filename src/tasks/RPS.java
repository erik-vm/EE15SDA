package tasks;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter game you want to play. 1 - classical, 2 - big bang version");
        int response = scanner.nextInt();
        scanner.nextLine();
        if (response == 1){
            System.out.println("Enter player one choice: ");
            String playerOne = scanner.nextLine().toLowerCase().trim();
            System.out.println("Enter player two choice");
            String playerTwo = scanner.nextLine().toLowerCase().trim();
            System.out.println(rockPaperScissors(playerOne, playerTwo));
        }else if (response == 2){
            System.out.println("Enter player one choice: ");
            String playerOne = scanner.nextLine().toLowerCase().trim();
            System.out.println("Enter player two choice");
            String playerTwo = scanner.nextLine().toLowerCase().trim();
            System.out.println(rockPaperScissorsLizardSpock(playerOne, playerTwo));
        }else {
            System.out.println("Invalid input");
        }



    }

    public static String rockPaperScissors(String playerOne, String playerTwo){
        String answer;
        if (!checkInputValid(playerOne, playerTwo)){
            return "Invalid input";
        }
        if (playerOne.equals("paper")&&playerTwo.equals("rock")|| // && will be executed before ||. its like multiply and divide ise before adding and subtracting
        playerOne.equals("rock") && playerTwo.equals("scissors")||
        playerOne.equals("scissors")&&playerTwo.equals("paper")) {
            answer = "Player one wins";
        }else if (playerOne.equals(playerTwo)){
            answer = "It's a tie";
            }else {
            answer = "Player two wins";
            }
        return answer;
        }

        public static String rockPaperScissorsLizardSpock(String playerOne, String playerTwo) {
            String answer;

            if (!checkInputValidLizardSpock(playerOne, playerTwo)) {
                return "Invalid answer";
            }
            if (playerOne.equals("rock") && (playerTwo.equals("scissors") || playerTwo.equals("lizard")) ||
                    playerOne.equals("paper") && (playerTwo.equals("rock") || playerTwo.equals("spock")) ||
                    playerOne.equals("scissors") && (playerTwo.equals("rock") || playerTwo.equals("lizard")) ||
                    playerOne.equals("lizard") && (playerTwo.equals("paper") || playerTwo.equals("spock")) ||
                    playerOne.equals("spock") && (playerTwo.equals("rock") || playerTwo.equals("scissors"))) {
                answer = "Player one won";
            } else if (playerOne.equals(playerTwo)) {
                answer = "It's a tie";
            } else {
                answer = "Player two won";
            }
            return answer;
        }
    //Method for validating input
    public static boolean checkInputValid(String playerOne, String playerTwo){
        return playerOne.matches("rock|scissors|paper") && playerTwo.matches("rock|paper|scissors");
    }
    public static boolean checkInputValidLizardSpock(String playerOne, String playerTwo){
        return playerOne.matches("rock|scissors|paper|spock|lizard") && playerTwo.matches("rock|paper|scissors|spock|lizard");
    }

}
