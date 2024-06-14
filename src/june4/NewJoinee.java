package june4;

public class NewJoinee {
    int id;
    String name;
    static  String company="Accenture"; //memory assigned once

    public NewJoinee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void printDetails(){
        System.out.println(id  + name  +  company);

    }



    }

