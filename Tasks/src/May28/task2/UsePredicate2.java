package May28.task2;

import java.util.function.Predicate;

public class UsePredicate2 {

    public static void main(String[] args) {

        Predicate<String> isValidPassword = str -> {

            int countUp = 0; int countLow = 0; int digit =0;  int specialChar = 0;

            for (int i = 0; i < str.length() ; i++) {
                if(Character.isUpperCase(str.charAt(i))){
                           countUp++;
                       }if(Character.isLowerCase(str.charAt(i))){
                           countLow++;
                       } if (Character.isDigit(str.charAt(i))){
                           digit++;
                       }else{
                           specialChar++;
                       }
                   }
            return (countUp >= 1 && countLow >= 1 && digit >= 1 && specialChar >= 1);
        };

        System.out.println(isValidPassword.test("Ssemih1$"));
        System.out.println(isValidPassword.test("semih"));

    }
}
