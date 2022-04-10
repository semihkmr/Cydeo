package Task30March;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
       String [] arr1 = {"one", "hi", "hold"};
       ArrayList<String> words = new ArrayList<>(Arrays.asList(arr1));
        System.out.println( getStar(words));
    }

    public static ArrayList<String> getStar (ArrayList<String> words){

        ArrayList<String> strNew = new ArrayList<>();

        for (int i = 0; i < words.size() ; i++) {

            String strStar="";
            String str = words.get(i);
            for (int j = 0; j <str.length() ; j++) {
                strStar+="*";


            }
            strNew.add(strStar);
        }return strNew;

    }
}
