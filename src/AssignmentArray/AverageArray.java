package AssignmentArray;

import java.util.Scanner;

public class AverageArray {
    static int []arr=new int[5];

    static int average(){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int average=0;
        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the number ");
            arr[i]= sc.nextInt();
            sum+=arr[i];
            average=sum/2;
        }return average;
    }
}
