package tasks;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height of a christmas tree.");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int space = height - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i == 1; i++){
            for (int space = height-1; space>0 ; space--){
                System.out.print(" ");
            }
            System.out.println("#");
        }

    }
}
