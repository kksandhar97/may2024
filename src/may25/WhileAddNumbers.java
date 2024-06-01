package may25;

public class WhileAddNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x<=10){
            System.out.println(x);
            sum = sum + x;
            x++;

        }
        System.out.println("Sum of first 10 numbers:" +sum);
    }
}
