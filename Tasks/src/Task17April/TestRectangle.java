package Task17April;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle(4,5);

        System.out.println(obj);
        System.out.println("----");
        obj.setWidth(3);
        obj.setLength(4);

        System.out.println(obj);

    }
}
