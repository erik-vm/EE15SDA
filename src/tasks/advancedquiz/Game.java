package tasks.advancedquiz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    //For storing all the question in one ArrayList
    private static ArrayList<Question> questions = new ArrayList<Question>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

      /*  System.out.println("Welcome! What do you want to do? \n\t0 - Quit \n\t1 - Play quiz \n\t2 - Enter new questions to quiz");

        int choice;
        boolean quit = false;

        while (!quit){
            choice = scanner.nextInt();
            switch (choice){
                case 0 : quit = true;
                break;
                case 1 :
                    System.out.println("Which quiz would you like to play? \n\t1 - Capital cities \n\t2 - Silly questions \n\t3 - Sport questions \nOr hit 0 to quit");
                    int gameChoice = scanner.nextInt();
                    switch (gameChoice){
                        case 0 : quit = true;
                        break;
                        case 1 : init(); loop();
                        break;
                        case 2 : initSilly(); loop();
                        break;
                        case 3: initSport(); loop();
                        break;
                    }
                    break;
                case 2 : createQuestion();
                break;
                default:
                    System.out.println("Enter number from 0-3");
            }
            System.out.println("What do you want to do? \n\t0 - Quit \n\t1 - Play quiz \n\t2 - Enter new questions to quiz");
        }



*/

        char again = 'y';
        char option = 'p';

        while (again == 'y'){
            System.out.println("Please choose quiz topic");
            System.out.println("1 - Capitals");
            System.out.println("2 - Silly");
            System.out.println("3 - Sports");
            System.out.println("Topic:");
            int input = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Do you want to play (p) or add (a) new question?");

            option = scanner.nextLine().charAt(0);

            if (option == 'p'){
                init(input);
                loop();
            }else{
                addQuestion(input);
            }
            System.out.println("Do you want to do something else? y/n");
            scanner.nextLine();
            again = scanner.nextLine().charAt(0);
        }
    }

    //Initialize game
  /*  private static void init() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data1.txt"));

            for (int i = 1; i < lines.size(); i += 4) {
                Question q;
                q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));
                questions.add(q);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }
    }*/
    private static void init(int number) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data" + number + ".txt"));

            //First lines value
            int temp = Integer.parseInt(lines.get(0));

            for (int i = 1; i < lines.size(); i += temp+1) {
                Question q;

                if (temp == 3){
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));
                }else {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));
                }

                questions.add(q);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }
    }

    private static void initSilly() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data2.txt"));

            for (int i = 1; i < lines.size(); i += 4) {
                Question q;
                q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));
                questions.add(q);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }
    }

    private static void initSport() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data3.txt"));

            for (int i = 1; i < lines.size(); i += 5) {
                Question q;
                q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));
                questions.add(q);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }
    }

    //Game play loop

    private static void loop() {

        int score = 0;

        while (questions.size() > 0) {
            Question currentQuestion = questions.remove(0);
            //Asking for right answer
            System.out.println(currentQuestion.text);
            for (int i = 0; i < currentQuestion.answers.length; i++) {
                System.out.println(i + 1 + ")" + currentQuestion.answers[i]);
            }
            System.out.println("Answer: ");
            int input = scanner.nextInt();
            //Validating input form user
            if (input < 0 || input > currentQuestion.answers.length) {
                System.out.println("Input is invalid");
                System.exit(-2);
            }
            //Checking is answer correct.
            if (currentQuestion.rightAnswer.equals(currentQuestion.answers[input - 1])) {
                System.out.println("Right answer.");
                score++;
            } else {
                System.out.println("Wrong answer.");
            }
        }
        System.out.println("You got " + score + " answers right.");
    }

    //Create new question

    private static void createQuestion() {
        String filePath = "";
        System.out.println("In which quiz you want to add questions? \n\t1 - Capital cities \n\t2 - Silly questions \n\t3 - Sports questions");
        int response = scanner.nextInt();
        scanner.nextLine();
        switch (response) {
            case 1:
                filePath = "Quiz\\data1.txt";
                break;
            case 2:
                filePath = "Quiz\\data2.txt";
                break;
            case 3:
                filePath = "Quiz\\data3.txt";
                break;
            default:
                System.out.println("Enter number from 1-3");
        }

        int numOfQuestions = 0;
try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
     numOfQuestions = Integer.parseInt(bufferedReader.readLine());
}catch (IOException e){
    e.printStackTrace();
}


try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))){
    System.out.println("Write a question:");
    bufferedWriter.write(scanner.nextLine());
    bufferedWriter.newLine();
    System.out.println("Write answers: ");
    for (int i = 1; i <= numOfQuestions;  i++){
        bufferedWriter.write(scanner.nextLine());
        bufferedWriter.newLine();
    }
}catch (IOException e){
    e.printStackTrace();
}
    }

    private static void addQuestion(int number){
        Question q = new Question();
        System.out.println("Please enter question");
        String text = scanner.nextLine();

        //Adding question to question object
        q.text = text;

        try{
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data" + number + ".txt"));
            String[] answers = new String[Integer.parseInt(lines.get(0))];
            for (int i = 0; i < answers.length; i++){
                System.out.println("Please enter " + (i+1) + ") answer");
                answers[i] = scanner.nextLine();
            }

            //Adding answers array to question object field
            q.answers = answers;

            //Writing info to quiz file

            File file = new File(("Quiz\\data" + number + ".txt"));
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);

            br.write("\n"+q.text);
            for (int i = 0; i < answers.length; i++){
                br.write("\n"+q.answers[i]);
            }
            br.close();
            fr.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}