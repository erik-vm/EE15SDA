package basic2;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine().toUpperCase();
        String lastName = new String("Vainumae");
        String fullName = firstName+ " " + lastName;
        System.out.println(fullName);

        String fullName2 = firstName.concat(" " + lastName);
        System.out.println(fullName2);

        //Compare String values
        System.out.println(firstName.equals(lastName));

        //Length of the String
        System.out.println(firstName.length());

        //Specific symbol
        System.out.println(lastName.charAt(0));

        //Uppercase of Lowercase
        System.out.println(firstName.toLowerCase() + lastName.toUpperCase());

        //indexOf
        String testValue = "This is test value";
        System.out.println(testValue.indexOf("is")); //this show the position of 'IS' inside word THIS
        System.out.println(testValue.indexOf(" is ")); // adding spaces will give the value of word IS

        //Replace
        String textTest = "This car is sitt. Your shop is also sitt. This river is perse.";
        System.out.println(textTest.replaceAll("sitt", "s**t").replaceAll("perse","p***e"));

        //Substrings
        System.out.println(textTest.substring(5)); //cuts of first 6 spaces

        //Substring with ending
        System.out.println(textTest.substring(5,16)); //cuts out from 6 - 17
    }
}
