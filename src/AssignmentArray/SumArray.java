package AssignmentArray;

import java.util.Scanner;

public class SumArray {
    public static int sum (int arr[]) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
            sum += arr[i];

        }return sum;
    }

}
