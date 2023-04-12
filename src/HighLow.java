import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        // random number generator
        Random random = new Random();
        int n = random.nextInt(100);
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Please guess the number: ");
        int guessNumber = scanner.nextInt();
        if(guessNumber < n){
            System.out.println("LOWER");
        }else if(guessNumber > n){
            System.out.println("HIGHER");
        }else if( n == guessNumber) {
            System.out.println("GOOD GUESS");
        }else{
            System.out.println("INVALID OPTION");
        }
    }
}
