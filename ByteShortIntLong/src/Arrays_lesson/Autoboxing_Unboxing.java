package Arrays_lesson;

import java.util.ArrayList;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        ArrayList<String> strArray = new ArrayList<String>();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        Integer integer = new Integer(54);

        for (int i=0; i<10;i++){
            intArray.add(Integer.valueOf(i));
            intArray.add(new Integer(i));
        }

        for (int i=0; i<intArray.size();i++){
            System.out.println(i + " ---> " + intArray.get(i).intValue());
        }
    }
}
