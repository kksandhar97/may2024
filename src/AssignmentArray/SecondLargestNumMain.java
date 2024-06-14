package AssignmentArray;

import java.util.Scanner;

import static AssignmentArray.SecondLargestNum.SecondMaxNum;

public class SecondLargestNumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr=new int[3];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter number: ");
            arr[i]= sc.nextInt();

        }int element = SecondMaxNum(arr);
        System.out.println("Second Max Number: " +element);
    }
}
