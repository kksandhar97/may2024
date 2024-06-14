package Assignment;

public class BankAccount {
    int accountNum;
    String accountHolder;
    int accountBalance;
    static int accountCreated = 12000;

    public BankAccount(int accountNum, String accountHolder, int accountBalance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public static double accountCreated(int accountCreated){
        return accountCreated;

    }
    public void accountDetails(){
        System.out.println("Account number:" + this.accountNum);
        System.out.println("Account holder name: " + this.accountHolder);
        System.out.println("Account Balance: " + this.accountBalance);
        System.out.println("Account created: " + accountCreated);
    }

}
