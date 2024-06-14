package june11;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "pragra";
        System.out.println(s1);

        String s2="pragra";
        System.out.println(s2);

        String s3 ="pragra";
        System.out.println(s3);

        s3 ="mouse";//new object and we are not changing the existing object of pragra..mouse will be created in string constant pool
        System.out.println(s3);

    }

    }

