package Tasks;

import java.util.Scanner;

public class ChristmasTree2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height of a tree: ");
        int height = scanner.nextInt();


        for (int i = 0; i<height; i++){
            for (int space = 0; space < height-1-i; space++){
                System.out.print(" ");
            }
            for (int stars = 0; stars < i*2+1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i<height-1; i++){
            System.out.print(" ");
        }
        System.out.println("#");


    }
}
