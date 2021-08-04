package Arrays_lesson;

import java.util.Scanner;

public class main_arraylistchallenge {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        System.out.println("Enter new name : ");
        String newName = scanner.nextLine();

        System.out.println("Enter the phone number : ");
        String newNumber = scanner.nextLine();

        mobilePhone.StoreContact(newName,newNumber);
    }

    public static void removeContact(){
        System.out.println("Enter the position of the contact to remove : ");
        int position = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.removeContact(position);
    }

    public static void modifyContact(){
        System.out.println("Enter the position of the contact to remove : ");
        int position = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.modifyContact(position);
    }

    public static void searchContact(){
        System.out.println("Enter the name of the contact to search : ");
        String nameToSearch = scanner.nextLine();
        scanner.nextLine();

        if (mobilePhone.isNameInContactList(nameToSearch)){
            System.out.println("Contact is available");
        } else {
            System.out.println("Contact is not available");
        }
    }
}
