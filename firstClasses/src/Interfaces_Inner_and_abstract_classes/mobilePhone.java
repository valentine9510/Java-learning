package Interfaces_Inner_and_abstract_classes;

public class mobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    boolean isOn = false;

    public mobilePhone(int myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " on phone");
        } else {
            System.out.println("Phone is off");
        }

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering ....");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ring ring");

        } else {
            isRinging = false;
            System.out.println("Mobile phone is not on or number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}