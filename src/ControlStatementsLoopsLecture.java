import java.util.Scanner;

public class ControlStatementsLoopsLecture {
    // boolean
    //> , >= , <= , == . !=
    public static void main(String[] args) {
        double discountPercentage = 2.3;
        System.out.println(discountPercentage > 2.0);
     // logical operators
    // && , || , & , | , !
        System.out.println(discountPercentage > 3 && discountPercentage == 2.3);

    // string comparaison
    Scanner sc = new Scanner(System.in);
        System.out.println("Continue? y/n");
        String userInput = sc.next();
        boolean confirmation = userInput.equalsIgnoreCase("y");
        System.out.println(confirmation);
    }
}
