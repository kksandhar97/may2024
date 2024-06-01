package may25;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the input ");
        String input = sc.next();

        switch (input) {
            case "Canada":
                System.out.println("Switch on the fan");
break;
            case "Mexico" :
                System.out.println("Switch on the light");
break;
            case "England":
                System.out.println("Switch on the Fan2");
break;
            case "Italy":
                System.out.println("default");



        }

    }
}
