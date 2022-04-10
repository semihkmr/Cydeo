package Task27March;

import java.util.Arrays;

public class Html {
    public static String getHtml(String str){

        String htlm = "";
        String [] parts = str.split("\\^");

        int repeat = Integer.parseInt(parts[1]);
        for (int i = 0; i < repeat ; i++) {
            htlm+= "<" + parts[0] + "></" + parts[0] + "> ";

        }
        return htlm;

    }

    public static void main(String[] args) {

        System.out.println(getHtml("div^2"));
        System.out.println(getHtml("li^3"));
    }



}
