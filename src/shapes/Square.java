package shapes;

public class Square extends Quadrilateral{

    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
       super.width = width;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(){};
    public double getPerimeter(){

    return 4 * super.length;
  }
    public double getArea(){

        return Math.pow(super.length, 2);
    }





//    @Override
//    public double getPerimeter() {
//        return super.getPerimeter();
//    }
////
//    @Override
//    public double getArea() {
//        return super.getArea();
//    }
//
//    @Override
//    public double setLength() {
//        return ;
//    }
//
//    @Override
//    public double setWidth() {
//        return 0;
//    }
//
//        public double getArea(){
//        double area = Math.pow(this.side ,2);
//        return area;
//    }
//
//    public double getPerimeter(){
//        double perimeter = 4 * this.side;
//        return perimeter;
//    }
}
