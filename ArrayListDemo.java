import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> Student = new ArrayList<>();
        Student.add("arun");
        Student.add("bala");
        Student.add("Raja");
        Student.remove("Raja");
        System.out.println("Arraylist Students:"+ Student);
    }
}
