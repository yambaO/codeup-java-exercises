package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        String prompt = "Enter the radius of the circle: ";
        String userInput = input.getString(prompt);
        double radius = Double.parseDouble(userInput);

        Circle circle1 = new Circle(radius);
        System.out.printf("The area of the circle is: %f\n", circle1.getArea());
        System.out.printf("The circumference of the circle is: %f\n", circle1.getCircumference());
    }
}
