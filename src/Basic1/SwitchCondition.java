package Basic1;
import java.util.Scanner;

public class SwitchCondition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current season please: ");

        String season = scanner.next();

        switch (season){
            case "Summer":
                System.out.println("But on your swimming clothes on, its summer!");
                break;
            case "Autumn":
                System.out.println("I love when leaves fall, its autumn!");
                break;
            case "Winter":
                System.out.println("Do you wanna build a snowman? Its winter!");
                break;
            case "Spring":
                System.out.println("Everything is blooming, its spring!");
                break;
            default:
                System.out.println("I afraid you have entered invalid season.");
                break;
        }




    }
}
