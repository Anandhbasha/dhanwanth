class Department{
    String deptName;
    Department(String deptName){
        this.deptName = deptName;
    }
}
class Students{
    String Name;
    Department dept;
    Students(String Name,Department dept){
        this.Name = Name;
        this.dept = dept;
    }
    void display(){
        System.out.println(Name+"-"+dept.deptName);
    }
}

public class Agreegation {
    public static void main(String[] args){
        Department d1 = new Department("CSE");
        Students s1 = new Students("ajay",d1);
        Department d2 = new Department("MECH");
        Students s2 = new Students("Arun",d2);
        s1.display();
        s2.display();


    }
}
