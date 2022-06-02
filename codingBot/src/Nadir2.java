import java.util.ArrayList;
import java.util.Arrays;

public class Nadir2 {

    public static boolean isPassword(String str){



        if(str.length() > 3 && str.length() < 16){
            if(Character.isDigit(str.charAt(0))){
                if(Character.isAlphabetic(str.charAt(str.length()-1))){
                    return true;
                }
            }


        }
        return false;
    }

    public static void main(String[] args) {
       String str = "1semigff";
        System.out.println(isPassword(str));
    }
}
