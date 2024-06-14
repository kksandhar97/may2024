package AssignmentArray;

import java.util.Scanner;

import static AssignmentArray.MinimumElement.Minimum;

public class MinimumElementMain {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter element: ");
            arr[i]= sc.nextInt();
        }
        int minimum = Minimum(arr);
        System.out.println("Minimum element: " +minimum);

        }
    }
