class Engine{
    void start(){
        System.out.println("Engine Started");
    }
}
class car{
    private Engine e;
    car(){
        e = new Engine();
    }
    void startCar(){
        e.start();
        System.out.println("Car Started");
    }
}
public class composition {
    public static void main(String[] args) {
        car c = new car();
        c.startCar();
    }
}
