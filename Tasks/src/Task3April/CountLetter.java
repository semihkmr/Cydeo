package Task3April;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetter {
    public  static  int  countLetter(ArrayList<String> strArr, char letter){
      
        int countLetter= 0;
            for(String each:strArr){
                for (int i = 0; i <each.length() ; i++) {
                    if(each.charAt(i)==letter){
                        countLetter++;
                    }
                    
                }
            } return countLetter;
    }

    public static void main(String[] args) {

        String[] str = {"java","html","css","java","javascript","selenium"};
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(str));
        char letter = 'a';
        System.out.println(countLetter(strArr,letter));
    }
}
