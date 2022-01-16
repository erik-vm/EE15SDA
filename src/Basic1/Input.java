package Basic1;

import java.util.Calendar;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Enter your birth year.");
         int birthYear = scanner.nextInt();
        System.out.println("Your birth year is " + birthYear);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Your name is " + name + " and you are " + (year-birthYear) + " years old.");

        // Multi else if

        //low temp < 36.4
        //ok temp 36.4 - 36.5
        //Normal temp == 36.6
        //high temp > 36.6

        float temp = 36.45f;

        if(temp < 36.4f){
            System.out.println("Low temp");
        } else if(temp >= 36.4f && temp <= 36.5f){
            System.out.println("OK temp");
        } else if(temp == 36.6f){
            System.out.println("Normal");
        } else {
            System.out.println("High temp");
        }

        // 0-2 - baby
        // 3-10 - kid
        // 11-17 - teen
        // 18 - 18
        // 19 - 120 adult

        int age = 121;

        if (age >= 0 && age <= 2){
            System.out.println("Baby");
        } else if (age >= 3 && age <= 10){
            System.out.println("Kid");
        } else if (age >= 11 && age <= 17){
            System.out.println("Teen");
        } else if(age == 18){
            System.out.println("18");
        } else if(age > 18 && age <= 120) {
            System.out.println("Adult");
        } else if(age < 0 || age > 120){
            System.out.println("Not in the range");
        }
    }
}
