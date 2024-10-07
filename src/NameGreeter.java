import java.io.InputStream;
import java.util.Scanner;

public class NameGreeter {
    private String name;

    public void read(InputStream inputStream){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(inputStream);
        name = scanner.nextLine();
    }

    public void greet(){
        System.out.println("Hello " + name);
    }
}
