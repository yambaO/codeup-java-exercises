import java.util.Scanner;
public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Bigfoot";
        String timeOfDay = "afternoon";
        int week =9;
        System.out.printf("Hello, %s", cohort);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = scanner.next();
        System.out.println("The user input:" + userInput);
        System.out.printf("Your string was s%");
    }
}
