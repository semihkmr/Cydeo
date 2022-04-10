package Task28MarchMemet;

import com.sun.source.util.Plugin;

public class Password {

    public static Boolean hasUpperCase(String str) {

        for (int i = 0; i <str.length() ; i++) {
        if (Character.isUpperCase(str.charAt(i))) {
                    return true;
                }
            }
        return false;
    }
    public static Boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }

        }
        return false;
    }
    public static Boolean hasDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }return false;
    }
        public static Boolean hasSpecialChar(String str){
            for (int i = 0; i <str.length() ; i++) {
                if(!Character.isLetterOrDigit(i)||!str.contains(" ")){
                    return true;
                }

            }return false;
        }

        public static Boolean isStrongPassword(String str) {



        if (str.length() >= 8 && !str.contains(" ")) {
          if(hasDigit(str)&&hasLowerCase(str)&&hasUpperCase(str)&&hasSpecialChar(str)){
              return true;

          }
            }return false;

    }

    public static void main(String[] args) {
        System.out.println(isStrongPassword("S*jav45ai1000sgre1at82"));
    }
}