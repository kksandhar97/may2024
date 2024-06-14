package June8;

public class Matrix {
    public static void main(String[] args) {

    //create two matrices
    int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
    int b[][]= {{4,5,6},{2,3,4},{1,2,3}};

    //create another one to store value
    int c[][]= new int [3][3];

    //adding and printing addition of two matrices
    for(int i=0;i<3;i++){
        for (int j=0;j<3;j++){
c[i][j]= a[i][j] + b[i][j];
            System.out.print(c[i][j] +" ");
        }
        System.out.println();
    }
    }


}
