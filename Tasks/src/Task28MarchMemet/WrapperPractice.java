package Task28MarchMemet;

import java.util.Arrays;

public class WrapperPractice {
    public static void main(String[] args) {

        String str = "jav45ai1000sgre1at82";
        str += " ";
        String str1="";
        for (int i = 0; i < str.length()-1; i++) {

            if (Character.isDigit(str.charAt(i))) {
                if (!Character.isDigit(str.charAt(i + 1))) {
                    str1 += str.charAt(i)+" ";
                } else {
                    str1 += str.charAt(i);
                }
            }
        }
        int sum = 0;
        String[] arrNumber = str1.split(" ");
        for (String each:arrNumber) {
            sum+=Integer.parseInt(each);
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arrNumber));
    }
    }
        // "jav45ai1000sgre1at82"





