package Arrays_lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static ArrayList<Contacts> contactArray = new ArrayList<Contacts>();
    private static Scanner userScanner = new Scanner(System.in);

    public void StoreContact (String name,String phoneNumber){
        Contacts contactToStore = new Contacts(name,phoneNumber);
        if (contactArray.contains(contactToStore)){
            System.out.println("Contact already exists");
        } else {
            contactArray.add(contactToStore);
            System.out.println("Successfully added contact");
        }
    }

    public void modifyContact(int position){
        System.out.println("You are going to modify contact : ");
        contactArray.get(position-1).printContact();

        //Ask to modify name
        System.out.println("Would you like to modify name ? : \n Enter yes or no ");
        if (userScanner.nextLine().toLowerCase().contains("yes")){
            System.out.println("Enter new name : ");
            String newName = userScanner.nextLine();
            modifyContactName(position,newName);
        }

        //Ask to modify number
        System.out.println("Would you like to modify phone number? : \n Enter yes or no ");
        if (userScanner.nextLine().toLowerCase().contains("yes")){
            System.out.println("Enter new number : ");
            String newNumber = userScanner.nextLine();
            modifyContactNumber(position,newNumber);
        }

    }

    private void modifyContactName(int position, String name){
        contactArray.get(position-1).setName(name);
    }

    private void modifyContactNumber(int position, String number){
        contactArray.get(position-1).setPhoneNumber(number);
    }

    public void removeContact(int position){
        contactArray.remove(position-1);
    }

    public void printContacts(){
        for (int i =0;i< contactArray.size();i++){
            System.out.print( (i+1) + ". " );
            contactArray.get(i).printContact();
        }
    }

    public boolean isNameInContactList(String name){
        for (int i =0;i< contactArray.size();i++){
            if (contactArray.get(i).getName().toLowerCase() == name.toLowerCase()){
                return true;
            }
        }
        return false;
    }
}
