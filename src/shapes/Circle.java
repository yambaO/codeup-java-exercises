package shapes;
import java.lang.Math;
public class Circle {
    private double radius;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        double area = Math.PI * Math.pow((this.radius), 2);
     return  area;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }
}
