package may28;

import java.util.Scanner;

public class Naturalnumbers {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        do{
            System.out.println(x);
            sum = sum + x;
            x++;
        }
        while (x<=n);
            System.out.println(sum);

        }

    }

