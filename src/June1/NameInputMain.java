package June1;

import java.util.Scanner;

public class NameInputMain {
    public static void main(String[] args) {
NameInput nameInput= new NameInput();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println(nameInput.input(name));
        System.out.println("Enter your email");
        String email = sc.next();
        System.out.println(nameInput.input1(email));
    }
}
