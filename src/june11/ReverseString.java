package june11;

public class ReverseString {
    public static void main(String[] args) {
        String s1 ="pragra";
        String reverse=" ";

        for (int i=0;i<s1.length();i++){
            char ch = s1.charAt(i); //extracts each character
             reverse=ch+reverse;  //adds each character in front of existing string

        }
        System.out.println(reverse);
    }
}
