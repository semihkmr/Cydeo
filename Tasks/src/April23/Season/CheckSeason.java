package April23.Season;

import org.w3c.dom.ls.LSOutput;

public class CheckSeason {

    public static void main(String[] args) {
        Fall obj1 = new Fall(12.2,20);
        System.out.println(obj1.activity());

        Spring obj2 = new Spring(22.2,18.2);
        System.out.println(obj2.activity());

        Summer obj3 = new Summer(15.2,11.2);
        System.out.println(obj3.activity());

        Winter obj4 = new Winter(9.2,8.7);
        System.out.println(obj4.activity());
    }

}
