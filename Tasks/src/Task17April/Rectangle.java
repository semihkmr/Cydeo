package Task17April;

public class Rectangle {

    private int length;
    private int width;

    public  Rectangle(int length, int width) {

        setLength(length);
        setWidth(width);
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "Length is: " + length + "\nWidth is: " + width +
                "\nRectangle area is: " + calculateArea() +
                "\nRectangle perimeter is: " + calculatePerimeter();
    }
}