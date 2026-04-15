class Outer{
    String sec = "A";
    class Student{
        String name = "bala";
        void display(){
            System.out.println("The Student Name is:" +name+ "Section is:"+sec);
        }
    }
}
public class inner {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Student s = obj.new Student();
        s.display();
    }
    
}
