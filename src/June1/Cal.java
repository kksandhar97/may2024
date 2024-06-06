package June1;

import java.util.Scanner;

public class Cal {
    Scanner sc = new Scanner(System.in);
    public void sum(){
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of two numbers"+sum);
    }
    public void sub(){
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sub = a-b;
        System.out.println(sub);
    }

}
