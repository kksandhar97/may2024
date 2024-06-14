package Assignment;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account details");
        System.out.println("Enter your account number");
        int accountNum =sc.nextInt();
        System.out.println("Enter your account Holder name");
        String accountHolder = sc.next();
        System.out.println("Check your account balance by number 1");
        int accountBalance = sc.nextInt();
        BankAccount bankAccount = new BankAccount(sc.nextInt(), "sc.next()", 12000);
        bankAccount.accountDetails();
    }
}
