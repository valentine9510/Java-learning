package Java.training;

public class ControlFlowStatements {
    public static void main(String[] args) {
        String month = "jaNuary";



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
