package Tasks;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array size: ");
        int arraySize = scanner.nextInt();
        float[] gradeArray = new float[arraySize];
        float sumOfGrades = 0;

        for (int i = 0; i < arraySize; i++){
            System.out.println("Please enter a grade nr " + (i+1));
            gradeArray[i] = scanner.nextFloat();
            sumOfGrades += gradeArray[i];

        }
        System.out.println("The average grade is: " + (sumOfGrades/arraySize));
        System.out.println("There where passed " + arraySize + " values.");





    }
}
