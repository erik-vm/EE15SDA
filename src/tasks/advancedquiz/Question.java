package tasks.advancedquiz;

public class Question {
    public String text;        // for storing question
    public String[] answers;   // for storing answers
    public String rightAnswer; // for right answer

    public Question(String text, String... answers){
        this.text = text;
        this.answers = answers;
        this.rightAnswer = answers[0];

        for (int i = 0; i < answers.length; i++){
            int randomIndex = (int) (Math.random() * answers.length);
            String temp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex] = temp;
        }

    }
    public Question(){

    }
}
