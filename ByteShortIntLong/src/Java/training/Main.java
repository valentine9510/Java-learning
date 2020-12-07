package Java.training;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
    int value = 3;
    int switchValue = 4;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
    }



    }

}
