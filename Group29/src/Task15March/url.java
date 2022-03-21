package Task15March;

import java.util.Arrays;

public class url {
    public static void main(String[] args) {
        String url = "https://learn.cydeo.com/courses/130";

      String[]  urlArray = url.split("/");
        System.out.println(Arrays.toString(urlArray));
        System.out.println(urlArray[0]);
        System.out.println(urlArray[2]);
        System.out.println(urlArray[3]);
        System.out.println(urlArray[4]);

    }
}
