package Extra.AccesModi.Practice2;

import Extra.AccesModi.Practice1.test1;

public final class test3 extends test1{

    public static void main(String[] args) {

        System.out.println("a = " + a); // we can only access protected from different package if is only subclass!
  // you can not access default ( no modifier ) from different package!!
    }
}
