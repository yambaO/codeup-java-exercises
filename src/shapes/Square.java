package shapes;

public class Square extends Rectangle{
  private double side;
    public Square(){

    }
    public Square(double side){
     super(side,  side);
     this.side = side;

    }

//    @Override
//    public double getPerimeter() {
//        return super.getPerimeter();
//    }
//
//    @Override
//    public double getArea() {
//        return super.getArea();
//    }


        public double getArea(){
        double area = Math.pow(this.side ,2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 4 * this.side;
        return perimeter;
    }
}
