package june4;

public class Person {
    public static void printName(){ //static method
        System.out.println("Developers");
    }
    public void printDetails (){
        System.out.println("Core Java");
    }
}
class PersonMain{
    public static void main(String[] args) {//static method
        Person person = new Person(); //object
        person.printDetails(); //void need object to call

        person.printName(); //static dont need object to call
    }
}
