package Vesa4;

import java.util.ArrayList;

public class Task2 {

  /*
  2) Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters
   */

      // arr["A","B","C"]

    public  void combination(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                combination(str, l+1, r);
                str = swap(str,l,i);
            }
        }


    }

    public static String swap(String a,int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        String str = "ABCD";
        int n = str.length();
        Task2 permutation = new Task2();
        permutation.combination(str, 0, n-1);
    }


}