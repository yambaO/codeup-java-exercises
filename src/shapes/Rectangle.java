package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    private double length;
//    private double width;
//    public Rectangle(){
//
//    }
//
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getPerimeter (){
////        this.length = rectangleLength;
////        this.width = rectangleWidth;
//        double perimeter =( 2 * this.length) + (2 * this.width);
//        return perimeter;
//    }
//
//    public double getArea(){
////        this.length = rectangleLength;
////        this.width = rectangleWidth;
//        double area = this.length * this.width;
//        return area;

//}

    @Override
    public void setLength(double length) {

         super.length =  length;
    }

    @Override
    public void setWidth(double width) {
         super.width = width;
    }


    public double getPerimeter() {

        double perimeter =( 2 * super.length) + (2 * super.width);
        return perimeter;

    }


    public double getArea() {

        return length * width;
    }
}

