package june4;

public class Counter {
    static int num = 0; //static variable
    Counter (){
        num++;
        System.out.println(num);
    }
}
class CounterMain{
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

}}