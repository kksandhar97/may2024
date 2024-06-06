package may28;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int luckyNum = 92;
            int num = sc.nextInt();
            if (num != luckyNum && num <= 100) {
                System.out.println("Better Luck next time");
            } else if (num == luckyNum) {
                System.out.println("You won the lottery");

            } else {
                System.out.println("Try again");
            }

        }


    }}


