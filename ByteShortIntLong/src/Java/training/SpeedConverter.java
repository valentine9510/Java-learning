package Java.training;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour +
                " km/h = " + milesPerHour +
                " mi/h");
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes = kiloBytes/1024;
        int remainingKiloBytes = kiloBytes%1024;

        System.out.println( kiloBytes + " KB = " + megaBytes + " MB and "
        + remainingKiloBytes + " KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23 || !barking) {
            return false;
        }
        else if (barking){
            if (hourOfDay < 8 || hourOfDay > 22 ) return true;
        }

        return false;
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        else if (year%4 != 0) return false;
        else if (year%100 !=0)return true;
        else if(year%400 == 0)return true;
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){
        return (int)(numberTwo*1000) == (int)(numberOne*1000);
    }
    public static boolean hasEqualSum (int numOne, int numTwo, int numThree){
        return (numTwo + numOne ) == numThree;
    }

    public static boolean hasTeen (int numOne, int numTwo, int numThree){
        return isTeen(numOne)||isTeen(numTwo)||isTeen(numThree);
    }
    public static boolean isTeen (int age){
        return (age >= 13 && age <= 19);
    }
}
