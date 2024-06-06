package June1;

public class Car {
    String color ="blue";
    String brand = "Tesla";
    String enginesize = "200";

    void brake(){
        System.out.println("Car brakes....");
    }
    void run(){
        System.out.println("Car is running");
    }
    boolean haselectricEngine(){
        return true;
    }
}
