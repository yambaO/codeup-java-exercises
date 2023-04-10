import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While loop
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
        // Do While by 2
//        int i = 0;
//        do{
//            System.out.println(i);
//            i+=2;
//        } while (i< 100);

        // Do While by 5
//        int i = 100;
//        do{
//            System.out.println(i);
//            i-=5;
//        } while (i> 10);
        // do while starting at 2 and display the square
//        int i = 2;
//        do{
//            System.out.println(i*i);
//            i *= i;
//        } while (i < 1000000);
        // refactor the two exercises for for loop

//        for(int i = 0; i < 100; i +=2){
//            System.out.println(i);
//        }

//         for(int i = 2; i < 1000000; i *=2){
//            System.out.println(i);
//        }

        // fizzbuzz
//       Write a program that prints the numbers from 1 to 100.
//        for(int i = 1; i <= 100; i++){
////            System.out.println(i);
//        //        For multiples of three: print “Fizz” instead of the number.
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + " is FizzBuzz");
//
//        //        For the multiples of five: print “Buzz”
//            }else if (i % 5 == 0){
//                System.out.println(i + " is Buzz");
//        //        For numbers which are multiples of both three and five: print “FizzBuzz”.
//            }else if(i % 3 == 0) {
//                System.out.println(i + " is Fizz");
//
//            }
        // Table of powers
        Scanner sc = new Scanner(System.in);
////        Prompt the user to enter an integer.
//        System.out.println("Please enter a number:");
//        int userInput = sc.nextInt();
//        for (int i = 1; i <= userInput; i++) {
//            System.out.println(i * i);
//            System.out.println(i * i * i);
//        }

//        Convert given number grades into letter grades.
        System.out.println("Please enter a number between 0 to 100");
        int userGrade = sc.nextInt();
        if(userGrade >= 88 && userGrade <= 100){
            System.out.println("Your grade is A ");
        }else if(userGrade >= 80 && userGrade <= 87) {
            System.out.println("Your grade is B ");
        }else if(userGrade >= 67 && userGrade <= 79) {
        System.out.println("Your grade is C ");
        }else if(userGrade >= 60 && userGrade <= 66) {
            System.out.println("Your grade is D ");
    }
    }

}