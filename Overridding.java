class Employees{
    void salary(){
        System.out.println("Basic Salary");
    }
}
class Developer extends Employees{
    @Override
    void salary(){
        System.out.println("Salary:30000");
    }
}

class Manager extends Employees{
    @Override
    void salary(){
        System.out.println("Salary:50000");
    }
}
public class Overridding {
    public static void main(String[] args){
        Employees e1 = new Employees();
        Developer e2 = new Developer();
        Manager e3 = new Manager();

        e1.salary();
        e2.salary();
        e3.salary();
    }
}
