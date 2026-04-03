class vehicle{
    boolean  vehcileAvalible = true; 
    void working(){
        System.out.println("Vehicle is Working");
    }
}
class car extends vehicle{
    String carName = "Alto";
}
class swift extends car{

}
public class multilevel {
    public static void main(String[] args) {
        car s = new car();
        s.vehcileAvalible = false;
        s.working();
        swift car1 = new swift();
        System.out.println(car1.carName);
        vehicle v = new vehicle();
        v.vehcileAvalible = true;
        
    }
}
