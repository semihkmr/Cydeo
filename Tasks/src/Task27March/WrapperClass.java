package Task27March;

public class WrapperClass {
    public static boolean checkUpperAndLower(String str){
       int countUpper=0;
       int countLower=0;
        for (int i = 0; i <str.length() ; i++) {
            char letter = str.charAt(i);
            if(Character.isUpperCase(letter)){
                countUpper++;
            }
            if(Character.isLowerCase(letter)){
                countLower++;
            }
        }
        if(countLower==countUpper){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkUpperAndLower("JAVA java"));
    }
}
