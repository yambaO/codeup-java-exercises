import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userInput = scanner.next();
        System.out.println("Hello," +  userInput);
    }
}
