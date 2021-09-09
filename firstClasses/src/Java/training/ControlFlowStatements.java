package Java.training;

import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {


    }
    public static void printChallenge(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0,count = 0;
        for(int i = 1 ; i <= 10; i++){
            System.out.println("Enter a number# "+ i);

            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt){
                System.out.println("Enter valid number");
                scanner.nextLine(); //handles next line character and if not put it will be an infinite loop
                i--;
                continue; //dont do rest of loop
            }

            int number = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)
            System.out.println("You entered " + number);
            sum += number;
        }
        System.out.println("The sum of the numbers that you entered is "+ sum);

        scanner.close();
    }

    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
    public static void printNumberInWord(int word){
        switch(word){
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) { //.tolowercase changes it all to lower case
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");


        }
    }
    public static void switch_string(String month) {
        switch (month.toLowerCase()) { //.tolowercase changes it all to lower case
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");


        }
    }
}
