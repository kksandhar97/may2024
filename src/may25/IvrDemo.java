package may25;

import java.util.Scanner;

public class IvrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to Rogers");
        System.out.println("**************");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Spanish");
        System.out.println("Press 0 for Exit");
        int choice = sc.nextInt();

        if (choice==1) {
            System.out.println("Press 1 for tech support");
            System.out.println("Press 2 for automatic response");
            System.out.println("Press 3 for billing support");
        }
                int num = sc.nextInt();
                if (num==1){
                    System.out.println("Hi my name is Farah..How may i help u");
                }
                else if (num==2){
                System.out.println("Your call is connecting to one of our customer representative");
            }
                else if (num==3){
                    System.out.println("Whats your data plan?");
                    System.out.println("Do you want to buy a new plan?");
                }
            else if (choice==2) {
                    System.out.println("¿Cómo puedo ayudarte?");
                }
            else if (choice==3) {
                    System.out.println("Thank you for calling to Rogers");
                }

        }


    }

