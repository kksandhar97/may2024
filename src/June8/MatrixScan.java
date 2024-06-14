package June8;

import java.util.Scanner;

public class MatrixScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2D array size");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.println("Enter array elements");
        int twoD [][]= new int[rows][columns];
        for(int i=0;i<rows;i++){
            for (int j=0;i<columns;j++){
                twoD[i][j]=sc.nextInt();
                System.out.println(twoD[i][j] + " ");
            }
        }
        System.out.println();
    }
}
