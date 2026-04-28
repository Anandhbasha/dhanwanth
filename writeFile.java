import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class writeFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("Hello, World!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
            Scanner reader = new Scanner(new File("myFile.txt"));
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println("File content: " + data);
            }            
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
