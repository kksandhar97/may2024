package may25;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
       boolean leapYear = true;
       if (year% 4==0) {
           System.out.println("Leap year");
       }

       else{
           System.out.println("Not a leap year");
       }
    }
}
