class  BankAccount {
    private double balance = 1000;  
    
    void deposit(double amount){
        balance +=amount;
    }
     void withdraw(double amount){
        if(amount<balance){
            balance -=amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    double checkBalance(){
        return balance;
    }
}
public class Encaps{
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.deposit(500);
        user1.withdraw(5000);
        System.out.println(user1.checkBalance());
        
}
}
