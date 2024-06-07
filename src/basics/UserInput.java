package basics;
import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
        // User Input
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("basics.Hello " + name);
        scanner.close();


    }
}
