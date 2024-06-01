package may25;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the account balance");
        int balance = sc.nextInt();
        if (balance <0){
            System.out.println("Account is in overdraft");
        }
        else if (balance>=0 && balance<100){
            System.out.println("Account has a low balance");
        }
        else if (balance>=100){
            System.out.println("Account has a healthy balance");
        }
    }
}
