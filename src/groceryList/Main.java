package groceryList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

     printInstructions();

        while (!quit){
            System.out.print("Enter your choice: ");
            choice =scanner.nextInt();

            //Fix
            scanner.nextLine();

            switch (choice){
                case 0 : printInstructions();
                break;
                case 1 : groceryList.printGroceryList();
                     break;
                case 2 : addItem();
                    break;
                case 3: modifyItem();
                    break;
                case 4 : removeItem();
                    break;
                case 5: searchItem();
                    break;
                case 6 : quit = true;
                    break;
                default:
                    System.out.println("Please enter number from 0-6.");
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quite the application");

    }
    public static void addItem(){
        System.out.println("Please enter the item you want to add to the list");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void removeItem(){
        System.out.println("Enter item you want to remove.");
        groceryList.removeGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter item nr you want to modify.");
        int itemNumber = scanner.nextInt();
        //Fix
        scanner.nextLine();
        System.out.println("Enter replacement");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1,newItem);
    }
    public static void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found: " + searchItem + " in our grocery list.");
        }else {
            System.out.println(searchItem + " is not on the grocery list.");
        }
    }

}
