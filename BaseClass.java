class Student{
    String name;
    int age;
}
public class BaseClass{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "abc";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);
        Student s2 = new Student();
        s2.name = "xyz";
        s2.age = 22;
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}