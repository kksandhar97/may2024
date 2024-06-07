package June1;

public class MethodOverloading {

    int sum (int num1,int num2){
        return num1+num2;
    }
    int sum (int num1,int num2, int num3) {
        return num1 + num2 + num3;
    }
    int sum (int num1,int num2,int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(25, 30, 40));
        System.out.println(methodOverloading.sum(25, 30));
        System.out.println(methodOverloading.sum(25, 30, 40, 55));
    }

}
