package Extra.encapsulation.square;

public class Square {

    private int side;
    private int side2;

    public int getSide() {
        return side;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        if(side2 > 5){
            this.side2 = side2;
        }
    }

    public void setSide(int side) {
        if(side > 0){
        this.side = side;
    }}

    public Square(int side){
        setSide(side);
        }

    public Square(int side,int side2){
        setSide(side);
        setSide2(side2);
    }

        public int calculateArea(){
         return  side * side2;
        }
        public int calculatePerimeter(){
        return  4 * side;
        }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
