package util;

import java.util.Scanner;

public class Input {
private Scanner scanner;


public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int getInt() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
    public int getInt(int min, int max) {
        int input = scanner.nextInt();
        while (input < min || input > max) {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            input = scanner.nextInt();
        }
        return input;
    }
    public double getDouble() {
        return scanner.nextDouble();
    }
    public double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        while (input < min || input > max) {
            System.out.printf("Please enter a number between %f and %f: ", min, max);
            input = scanner.nextDouble();
        }
        return input;
    }
    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
}
