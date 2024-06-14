package june4;

public class StaticBlock {
    static {   // static block... print first without object and it dont needs to be call
        System.out.println("Java Developers");
    }
    public void printName(){ // void method need object and needs to be call
        System.out.println("QA Engineer");
    }
    public static void printDetails(){ //static method dont need object and it needs to be called
        System.out.println("Team Lead");
    }
    {
        System.out.println("Instance block"); // need object to be called new StaticBlock(); is object
    }
}
