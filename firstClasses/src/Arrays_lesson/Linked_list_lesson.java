package Arrays_lesson;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Linked_list_lesson {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "KLA");
        addInOrder(placesToVisit, "USA");
        addInOrder(placesToVisit, "CAN");
        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "NZE");
        addInOrder(placesToVisit, "USA");

        printList(placesToVisit);
        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //Equal to not add
                System.out.println(newCity + " is already included as destination");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //Move to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in itinerary");
        } else {
            System.out.println("Now visiting" + listIterator.next());
            printMenu();
        }


        while(!quit)

        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    } else {
                        System.out.println("We are at start of list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit");
        System.out.println("1 - to visit next city");
        System.out.println("2 - to visit previous city");
        System.out.println("3 - to print menu options");
    }
}
