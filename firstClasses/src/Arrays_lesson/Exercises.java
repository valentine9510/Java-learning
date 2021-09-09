package Arrays_lesson;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void array_challenge_exercise(){
        //int [] challenge_array = sortIntegers(getIntegers(5));
        int [] challenge_array = getIntegers(5);
        int [] copy_array = Arrays.copyOf(challenge_array,challenge_array.length);
        //Arrays.sort(copy_array, Collections.reverseOrder());
        Arrays.sort(challenge_array);
        for (int i = 0;i<copy_array.length;i++){
            copy_array[copy_array.length-i-1] = challenge_array[i];
        }
        printArray(copy_array);
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element " + i + " is : " + array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++){
            values[i]= scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] values){
        int sum = 0;
        for(int i=0; i<values.length;i++){
            sum += values[i];
        }

        return ((double) sum/values.length);
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);

        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i=0; i<array.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
