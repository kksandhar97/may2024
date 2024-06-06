package may28;

import java.util.Scanner;

public class Quit {
    public static void main(String[] args) {
        char c;
        do {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rogers");
        System.out.println("**************");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Spanish");
        System.out.println("Press 0 for Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Press 3 for tech support");
                System.out.println("Press 4 for automatic response");
                System.out.println("Press 5 for billing support");

                int num = sc.nextInt();
                if (num == 3) {
                    System.out.println("Hi my name is Farah..How may i help u");
                } else if (num == 4) {
                    System.out.println("Your call is connecting to one of our customer representative");
                } else if (num == 5) {
                    System.out.println("Whats your data plan?");
                    System.out.println("Do you want to buy a new plan?");
                }
                break;
            case 2:
                System.out.println("¿Cómo puedo ayudarte?");
                break;
            case 0:
                System.out.println("Thank you for calling to Rogers");
        }

        System.out.println("Do u still want to continue?");
        System.out.println("press 'y' for yes and 'n' for no");
        c = sc.next().charAt(0);
   } while (c=='Y'|| c=='y');
    }
}




