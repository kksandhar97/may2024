package Assignment;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle");
        System.out.println("Side A");
        int sideA = sc.nextInt();
        System.out.println("Side B");
        int sideB = sc.nextInt();
        System.out.println("Side C");
        int sideC = sc.nextInt();
        if (sideA == sideB && sideB == sideC){
            System.out.println("Equilateral");
        }
        else if (sideA == sideB ||sideB == sideC||sideA == sideC){
            System.out.println("Isoceles");
        }
        else{
            System.out.println("Scalene");
        }
}
    }
