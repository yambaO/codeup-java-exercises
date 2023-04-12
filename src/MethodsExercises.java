import java.util.Random;

import java.util.Scanner;

public class MethodsExercises {

    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Subtract(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int MultiplyWithLoop(int a, int b) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += b;

        }
        return sum;
    }
   public static void factorial(){
       System.out.println("Please  enter an integer from 1 to 10");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput >= 1 && userInput <= 10){
            long result = 1;
            for(int i = 1; i <= userInput; ++i ){
                result *=i;
            }
            System.out.println(result);
            System.out.println("Do you  wish to continue ? [y/n]");
            String answer = sc.next();
            if(answer.equalsIgnoreCase("y")){
                factorial();
            } else if(answer.equalsIgnoreCase("n")) {
                System.out.println("See you next time");
            }
        }else{
            System.out.println("Invalid input");
            factorial();
        }
   }

public static int randomNumber(){
    int random = (int)(Math.random()*6) + 1;
    return random;
}



    public static void main(String[] args) {
//        System.out.println(Add(3, 5));
//        System.out.println(Subtract(10, 5));
//        System.out.println(Multiply(100, 3));
//        System.out.println(divide(40,2));
//        System.out.println(modulo(5, 3));
//        System.out.println(MultiplyWithLoop(6, 16));
//         factorial();
        //Dice
        System.out.println("Please enter the number of dice: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDice = scanner.nextInt();
        System.out.print("You rolled: ");
        int total = 0;
        for( int i = 0; i < numberOfDice; i++){
            total += randomNumber();
        }
        System.out.println(total);
        }
    }

