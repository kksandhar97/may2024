public class LogicalOp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;
        boolean result = (x> y) && (x> a);
        System.out.println(result);
        boolean result1 = ! (x!= y);
        System.out.println(result1);
        boolean result2 = !((x< y) || (x> a));
        System.out.println(result2);

    }
}
