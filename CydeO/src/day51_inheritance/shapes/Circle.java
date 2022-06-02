package day51_inheritance.shapes;

public class Circle extends Shape {

     double radius;
    public Circle(double radius){
        super("circle");

       // this.name = name;
        this.radius = radius;

    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
