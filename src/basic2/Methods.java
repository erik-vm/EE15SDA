package basic2;
import java.util.Calendar;
import java.util.Scanner;

public class Methods {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // printPersonInfo("Erik", 1988);
        //printPersonInfo("Bob", 1954);

        //String[] names = new String[]{"Erik", "Piret", "Nora"};
        //System.out.println(getFirstInLine(names));

        multi(8,9);

    }

    static void printPersonInfo(String name, int birthYear){

        int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;

        System.out.println("Hello " + name + "! You are born in " + birthYear + " and you are " + age + " years old.");
    }

    static String getFirstInLine(String[] namesList){

        return namesList[2];
    }

    static void multi(int num1, int numb2){
        System.out.println(num1 + " * " + numb2 + " = " + (num1*numb2));
    }

}
