import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String username;
        if (args.length > 0) {
            username = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your username: ");
            username = sc.nextLine();
        }
        System.out.println("Hello, " + username + "! Welcome.");
    }
}
