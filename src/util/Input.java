package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Do you want to continue?[y/n]");
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

    // use this yesNo method in combination
    // with getString(). Pass the return from a getString()
    // to this method
    public boolean yesNo(String input){
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInt(min, max);
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        return scanner.nextInt();
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %.1f and %.1f:", min, max);
        double userNum = scanner.nextDouble();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getDouble(min, max);
    }

    public double getDouble(){
        System.out.println("Enter a number (decimals allowed):");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public void getGhost(){
        System.out.println("");
        String ghost = scanner.nextLine();
    }

}
