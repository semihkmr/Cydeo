package Task3April;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static ArrayList<String> RemoveLong(ArrayList<String> strArr,int maxChar){

        strArr.removeIf(each -> each.length() < maxChar);
return strArr;
    }

    public static void main(String[] args) {
        String[] list = {"one","two","three","four","five","six"};
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(list));
        int maxChar = 4;
        System.out.println(RemoveLong(strArr,maxChar));
    }
}
