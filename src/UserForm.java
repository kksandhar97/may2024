import java.util.Scanner;
public class UserForm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String firstName = sc.next();
        System.out.println("Enter the Last Name: ");
        String lastName = sc.next();
        System.out.println("Enter the Salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the Registeration number: ");
        int regNum = sc.nextInt();
        System.out.println("User" + firstName+ "is registered succesfully");
        System.out.println("First Name:" + firstName);
        System.out.println("Last name:" + lastName);
        System.out.println("Salary:" + salary);
        System.out.println("Registeration number:" + regNum);

    }
}
