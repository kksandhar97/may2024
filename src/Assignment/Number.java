package Assignment;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        if (num > num2){
            System.out.println("First number is greater than second number");
        }
        else if (num == num2){
            System.out.println("First number is equal to second number");
        }
        else if (num < num2){
            System.out.println("First number is less than second number");
            }
    }
}
