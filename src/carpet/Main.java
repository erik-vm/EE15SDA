package carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor size. Length and width.");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Floor floor = new Floor(length, width);

        System.out.println("Enter carpet price: ");
        double cost = scanner.nextDouble();
        Carpet carpet = new Carpet(cost);

        Calculator calculator = new Calculator(floor, carpet);
        System.out.printf("Total cost: %.2f ", calculator.getTotalCost());
        }
    }

