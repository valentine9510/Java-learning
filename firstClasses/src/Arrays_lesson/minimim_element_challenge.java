package Arrays_lesson;

import java.util.Scanner;

public class minimim_element_challenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your count ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int [] arrayTest = readIntegers(count);
        System.out.println("The min value of those numbers is " + findMin(arrayTest));
        return;
    }

    public static int[] readIntegers(int count){
        int[] userArray = new int[count];

        for(int i = 0; i<userArray.length;i++){
            userArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return userArray;
    }

    public static int findMin(int [] testArray){
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<testArray.length;i++){
            if (testArray[i] <= min){
                min = testArray[i];
            }
        }

        return min;
    }
}
