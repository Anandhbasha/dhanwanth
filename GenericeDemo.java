class Box<T>{
    T age;
    void add(T age){
        this.age=age;
    }
    T get(){
        return age;
    }
}
public class GenericeDemo {
    public static void main(String[] args) {
        Box <String> s1 = new Box<>();
        s1.add("111ME105");
        System.out.println(s1.get());
        Box <Integer> s2 = new Box<>();
        s2.add(5000);
        System.out.println(s2.get());
    }
}