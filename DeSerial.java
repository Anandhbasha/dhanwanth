import java.io.FileInputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
class User implements Serializable{
    String name;
    int balance;

    User(String name,int balance){
        this.name= name;
        this.balance = balance;
    }
}
public class DeSerial {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("user.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            User u = (User)in.readObject();
            in.close();
            file.close();
            System.out.println("Name:"+u.name);
            System.out.println("Balance:"+u.balance);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
