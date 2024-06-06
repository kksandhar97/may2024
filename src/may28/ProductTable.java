package may28;

import java.util.Scanner;

public class ProductTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table");
        int n = sc.nextInt();
        int j;
        for (j = 1; j <= 10; j++) {
            System.out.println(n + "*" + j + "=" + n * j);

        }
    }
}

