package basic1;
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int grade = scanner.nextInt();

      if (grade <= 4){
          System.out.println("Ok");
          if (grade <= 7){
              System.out.println("4-7");
          }
          else{
              System.out.println("7-10");
          }
      }
      else {
          System.out.println("Not ok");
      }
    }
}
