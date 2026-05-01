import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class User implements Serializable{
    String name;
    int balance;

    User(String name,int balance){
        this.name= name;
        this.balance = balance;
    }
}
public class SerializeDemo {
    public static void main(String[] args) {
        try{
            User u = new User("Dhanwanth",5000);
            FileOutputStream file = new FileOutputStream("user.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(u);
            out.close();
            file.close();
            System.out.println("Object Serilaization Successfully");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
