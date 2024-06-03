package June1;

import java.util.Scanner;

public class CalculatorClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to my calculator");
        String input = sc.next();
        System.out.println("Enter the first number ");
        double num1= sc.nextDouble();
        System.out.println("Enter the operators +,-,/,%,*");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second number ");
        double num2 = sc.nextDouble();
}


}
