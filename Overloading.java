class Payment{
    void pay(int amount){
        System.out.println("Paid"+amount+"using Cash");
    }
    void pay(int amount,String Number){
        System.out.println("Paid"+amount+"using Card"+Number);
    }
    void pay(int amount,String Upiid,boolean isUPI){
        System.out.println("Paid"+amount+"using UPI"+Upiid);
    }
}
public class Overloading {
    public static void main(String[] args){
        Payment p = new Payment();
        p.pay(2000);
        p.pay(2000,"465454644545");
        p.pay(2000,"465454644545@upi",true);
    }
}
