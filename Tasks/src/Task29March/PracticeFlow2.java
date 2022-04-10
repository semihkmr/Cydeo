package Task29March;

import java.util.ArrayList;

public class PracticeFlow2 {
    public static void main(String[] args) {
        ArrayList<String> arr =new ArrayList<>();

        arr.add("Iron Man");
        arr.add("Spider Man");
        arr.add("Thor");
        arr.add("Captain America");
        arr.add("Hawkeye");

        arr.remove(2);
        System.out.println(arr);
        arr.remove("Iron Man");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);


    }
}
