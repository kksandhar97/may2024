package june4;

public class NewJoineeMain {
    public static void main(String[] args) {
        NewJoinee ji = new NewJoinee(1, "Karan");
        NewJoinee j2 = new NewJoinee(2, "Harman");
        NewJoinee j3 = new NewJoinee(3, "Sam");
        ji.printDetails();
        j2.printDetails();
        j3.printDetails();
    }
}