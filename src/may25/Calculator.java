package may25;

import java.util.Scanner;

public class Calculator {
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

        switch(input) {
            case "Addition":
                System.out.println("Sum of two numbers: "+ (num1+num2));
                break;
            case "Subtraction":
                System.out.println("Subtraction of two numbers:" + (num1-num2));
                break;
            case "Multiplication":
                System.out.println("Multiplication of two numbers:" + (num1*num2));
                break;
            case "Division":
                System.out.println("Division of two numbers:" + (num1/num2));
                break;
            case "Modulus":
                System.out.println("Modulus of two numbers:" + (num1%num2));
                break;
            default:
                    System.out.println("Exit");







        }








        }

    }

