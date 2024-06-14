package Assignment;

import java.util.Scanner;

public class BookStoreMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book details");
        String Author= sc.next();
        String Tilte = sc.next();
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        BookStore bookStore = new BookStore("Develpoers","KKR",20, 10);
bookStore.bookDetails();
    }
}
