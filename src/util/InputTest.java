package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        System.out.println("You entered: " + input.getString());

        System.out.print("Enter yes or no: ");
        System.out.println("You entered: " + input.yesNo());

        System.out.print("Enter an integer between 1 and 10: ");
        System.out.println("You entered: " + input.getInt(1, 10));

        System.out.print("Enter an integer: ");
        System.out.println("You entered: " + input.getInt());

        System.out.print("Enter a decimal between 1.0 and 10.0: ");
        System.out.println("You entered: " + input.getDouble(1.0, 10.0));

        System.out.print("Enter a decimal between 1.0 and 10.0: ");
        System.out.println("You entered: " + input.getDouble("4.0, 15.0"));

        System.out.print("Enter a decimal: ");
        System.out.println("You entered: " + input.getDouble());

    }
}
