package may25;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the alphabet");
        char alphabet = sc.next().charAt(0);
       if (alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'){
           System.out.println("vowel");
       }
else {
           System.out.println("consonant");
       }
    }
}
