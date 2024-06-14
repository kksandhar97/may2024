package june11;

public class StingDemo {
    public static void main(String[] args) {
        String s1="Keyboard";//object refers to non string constant pool

        String s2 ="Keyboard";//object refers to non string constant pool

        String s3=new String("Keyboard");//non string constant pool, normal heap

        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s3));//true
    }
}
