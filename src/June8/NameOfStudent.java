package June8;

import java.util.Scanner;

public class NameOfStudent {
    public static void main(String[] args) {
        String[] studentName = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name");

        for (int i =0; i<studentName.length;i++) {
            studentName[i] = sc.next();
        }
for (int i=0; i<studentName.length;i++){
    System.out.println("Student name: " +studentName[i]);
}
    }
}
