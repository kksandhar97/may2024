import java.util.Scanner;

public class UserApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Name: ");
            String firstName = sc.next();
            System.out.println("Enter the Last Name: ");
            String lastName = sc.next();
            System.out.println("Enter the Email: ");
            String email = sc.next();
            System.out.println("Enter the Registeration number: ");
            int regNum = sc.nextInt();
            System.out.println("Address: ");
            String address = sc.next();
            System.out.println("Salary: ");
            int salary = sc.nextInt();
            System.out.println("User" + firstName + "is registered successfully");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Registeration number: " + regNum);
            System.out.println("Address: " + address);
            System.out.println("Salary: " + salary);
        }



}
