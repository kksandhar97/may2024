package may25;

import java.util.Scanner;

public class SwitchFan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Switch on th fan");
            break;
            case 2:
                System.out.println("Switch on the bulb");
                break;
            case 3:
                System.out.println("Switch on the TV");
                break;
            default:
                System.out.println("No electricity");


        }
    }
}
