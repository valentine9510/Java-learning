package Arrays_lesson;

import java.sql.SQLOutput;
import java.util.Arrays;

public class References_Value_types {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int []anotherArray = myIntArray;
        anotherArray[0] = 1;
        myIntArray[1] = 5;
        anotherArray[2] = 56;
        myIntArray[3] = 23;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        return;
    }
}
