import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %,.2f.%n",  pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("The number entered is:" + userInput);

        System.out.println("Please enter a word: ");
        String userWord1 = scanner.next();
        System.out.println("Please enter a word: ");
        String userWord2 = scanner.next();
        System.out.println("Please enter a word: ");
        String userWord3 = scanner.next();
        System.out.println("Here is the first word:" + userWord1);
        System.out.println("Here is the second word:" + userWord2);
        System.out.println("Here is the third word:" + userWord3);

//        System.out.println("Please enter a sentence");
//        String userSentence = scanner.next();
//        System.out.println(userSentence);// won't take the entire sentence

//        System.out.println("Please enter a sentence");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        // Calculate perimeter

        System.out.println("Enter the value of the width");
        String width = scanner.next();
        String input = scanner.nextLine();
        System.out.println("Enter the value of the length");
        String length = scanner.next();
        String input1 = scanner.nextLine();
        int perimeter= (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
        int area = Integer.parseInt(width) *Integer.parseInt(length);
        System.out.println("the perimeter of the classroom is " + perimeter);
        System.out.println("The area of the classroom is " + area);

        // Calculate the volume
        System.out.printf(" The volume of the classroom %,.2f");


    }
}
