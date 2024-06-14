package june4;

public class Employee {
    int id;
    String companyName;

    public Employee() {
        System.out.println("default");
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String companyName) {
        this();
        this.id = id;
        this.companyName = companyName;
    }
    public void printEmployeeDetails(){
        System.out.println(id);
        System.out.println(companyName);
    }
}
