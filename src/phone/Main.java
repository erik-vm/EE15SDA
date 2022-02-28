package phone;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+123 456 789");

    public static void main(String[] args) {

        boolean quit = false;

        startPhone();

        while (!quit){
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                case 1: mobilePhone.printContacts();
                    //print all contacts
                    break;
                case 2: addContact();
                    // add new contact
                    break;
                case 3: updateContact();
                    // update contact
                    break;
                case 4:removeContact();
                    //remove contact
                    break;
                case 5 : queryContact();
                    //find contact
                    break;
                case 6: printActions();
                    //print out actions
                    break;
            }

        }
    }
    //Add new contact
    private static void addContact(){
        System.out.println("Enter a name to add:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name,number);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("Name: " + name + " Number: "+ number + " has been added to contact list");
        }else {
            System.out.println("Can not add "  + name + ", contact already exists.");
        }
    }

    //Start phone
    private static void startPhone(){
        System.out.println("Starting phone");
    }
    //Print all actions
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    //Update contact
    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated contact");
        }else{
            System.out.println("Error updating contact");
        }
    }

    //Remove contact
    private static void removeContact(){
        System.out.println("Enter contact you want to remove");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact was not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully removed contact.");
        }else {
            System.out.println("Removing contact failed.");
        }
    }

    //Query contact
    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number: " + existingContactRecord.getPhoneNumber());
    }
}
