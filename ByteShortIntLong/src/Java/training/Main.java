package Java.training;

import Classes.bankaccount;

public class Main {

    public static void main(String[] args) {
        bankaccount accountOne = new bankaccount("0123456",1_000,"Valentine","vssebuyungo@gmail.com", "7783239774");
        //bankaccount accountOne = new bankaccount();

        accountOne.withdrawFunds(3_000);
        System.out.println("Account balance is : " + accountOne.getBalance());
        accountOne.withdrawFunds(500);
        System.out.println("Account balance is : " + accountOne.getBalance());

        bankaccount timsAccount = new bankaccount("Tim", "tim@gmail.com", "123456");

    }


}

