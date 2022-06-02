package Extra.override;

public class School {

    public static void main(String[] args) {


        Circle obj1 = new Circle(1.2);
        System.out.println("obj1.area() = " + obj1.area());
        System.out.println("obj1.perimeter() = " + obj1.perimeter());

        Rectangle obj2 = new Rectangle(1.2,4.4);
        System.out.println("obj2.area() = " + obj2.area());
        System.out.println("obj2.perimeter() = " + obj2.perimeter());


        Square obj3 = new Square(4.2);
        System.out.println("obj3.area() = " + obj3.area());
        System.out.println("obj3.perimeter() = " + obj3.perimeter());
    }
}
