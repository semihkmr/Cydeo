package Extra.encapsulation.square;

public class Runner {


    public static void main(String[] args) {


        Square obj1 = new Square(2);

        Square obj2 = new Square( -2);

        obj2.setSide(3);
        obj2.setSide2(4);

      //  System.out.println("obj2 = " + obj2);

        System.out.println("obj2.getSide2() = " + obj2.getSide2());


    }


}
