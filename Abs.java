// abstract class Vehicle{
//     abstract void start();
//     // unable create the object
//     //no body
// }
// class Car extends Vehicle{
//     void start(){
//         System.out.println("Car Starts");
//     }
// }

// class Bike extends Vehicle{
//     void start(){
//         System.out.println("Bike Starts");
//     }
// }
// public class Abs {
//     public static void main(String[] args) {
//         Bike b = new Bike();
//         b.start();
//     }
// }

abstract class Bank{
    abstract void intrestRate();
}
class SBI extends Bank{
    void intrestRate(){
        System.out.println("SBI Intrest Rate is :6%");
    }
}
class HDFC extends Bank{
    void intrestRate(){
        System.out.println("HDFC Intrest Rate is :7%");
    }
}
public class Abs{
    public static void main(String[] args){
        SBI s = new SBI();
        HDFC h = new HDFC();
        s.intrestRate();
        h.intrestRate();
    }
}
