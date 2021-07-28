package Classes;

public class bankaccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankaccount(){
        this("01234",2.5,"Default name", "Default email", "01234556789");
    }

    public bankaccount(String customerName, String email, String phoneNumber) {
        this ("9999", 100.55 , customerName , email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public bankaccount (String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber =  phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void depositFunds(double depositAmount){
        balance += depositAmount;
    }
    public void withdrawFunds (int withdrawAmount){
        if (balance - withdrawAmount < 0){
            System.out.println("Insufficient funds , current balance is : " + balance);
            return;
        } else {
            balance -= withdrawAmount;
            System.out.println( "Withdrawal of " + withdrawAmount + " processed. Remaining balance is : " + balance);
        }
    }
}
