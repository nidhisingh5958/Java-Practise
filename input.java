import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class input {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        
        // Create a BufferedReader object to read input from the console
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        System.out.println("Enter your name: ");

        String name = reader.readLine();
        System.out.println("Hello " + name);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        scan.close();
        reader.close();

    }
    
}
