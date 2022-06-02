package Task17April;

public class Square {


    private double side;

    public  Square(double side){

      setSide(side);
    }

    public double getSide() {
        if (side > 0) {

        }return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double calculateArea(){

        return  side * side ;
    }
    public double calculatePerimeter(){

return side * side * side * side ;
    }

    @Override
    public String toString() {
        String obj = "Square info: ";
        obj += "\nSide is " + side;
        obj += "\nArea is " + calculateArea();
        obj += "\nPerimeter is " + calculatePerimeter();
        return obj;
    }
}

