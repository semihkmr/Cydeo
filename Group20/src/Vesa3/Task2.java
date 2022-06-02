package Vesa3;

public class Task2 {

    /*
    2) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean isValidPassword(String str){
        boolean result = false;
        int upperCase=0;
        int lowerCase=0;
        int specialChar = 0;
        int digit = 0;
        if(str.length()<6||str.contains(" ")){
        result = false;
        }

        for (int i = 0; i <str.length() ; i++) {
            char letter = str.charAt(i);
            if(Character.isUpperCase(letter)){
                upperCase++;
            }
            if(Character.isLowerCase(letter)){
                lowerCase++;
            }
            if(Character.isDigit(letter)){
                digit++;
            }
            if(!Character.isDigit(letter)&&!Character.isLetter(letter)){
                specialChar++;
            }}
         if(upperCase >=1 && lowerCase >=1 && digit >=1 && specialChar >= 1) {
             result = true;
         }



        return result;
    }

    public static void main(String[] args) {

        System.out.println("isValidPassword(\"semih12S.\") = " + isValidPassword("semih12S."));
        System.out.println("isValidPassword(\"semih1\") = " + isValidPassword("semih1"));
        System.out.println("isValidPassword(\"seq\") = " + isValidPassword("seq"));
    }
}
