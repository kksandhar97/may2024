package June1;

import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter your input");
        String input = sc.next();
        Cal cal = new Cal();
        switch (input) {
            case "Addition":
                cal.sum();
                break;
            case "Subtraction":
                cal.sub();
                break;
        }
    }
}