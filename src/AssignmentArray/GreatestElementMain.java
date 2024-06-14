package AssignmentArray;

import java.util.Scanner;

import static AssignmentArray.GreatestElement.maxElement;

public class GreatestElementMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner (System.in);
        for(int i=0; i< arr.length;i++)
        {
            System.out.println("Enter an element to an Array: ");
            arr[i] = sc.nextInt();
        }

        int max= maxElement(arr);

        System.out.println("Max element: "+ max);
    }
}
