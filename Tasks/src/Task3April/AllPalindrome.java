package Task3April;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {

    public static ArrayList<String> GetPalindrome(ArrayList<String> strArr){

        ArrayList<String> palindrome = new ArrayList<>();

        for(String each:strArr){
            String reverse="";
            for (int i = each.length()-1 ; i >=0 ; i--) {
                reverse+=each.charAt(i);

            }
            if(reverse.equalsIgnoreCase(each)){
                palindrome.add(each);
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String[] str = {"Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"};

        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(str));

        System.out.println(GetPalindrome(strArr));
    }
}
