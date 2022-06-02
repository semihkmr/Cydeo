package Roman;
import java.util.*;

public class RomanNumber {
    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

     */


     public int value(char r)
        {
            if (r == 'I')
                return 1;
            if (r == 'V')
                return 5;
            if (r == 'X')
                return 10;
            if (r == 'L')
                return 50;
            if (r == 'C')
                return 100;
            if (r == 'D')
                return 500;
            if (r == 'M')
                return 1000;
            return -1;
        }

        // Finds decimal value of a
        // given roman numeral
        int romanToDecimal(String str)
        {
            // Initialize result
            int res = 0;

            for (int i = 0; i < str.length(); i++) {
                // Getting value of symbol s[i]
                int s1 = value(str.charAt(i));

                // Getting value of symbol s[i+1]
                if (i + 1 < str.length()) {
                    int s2 = value(str.charAt(i + 1));

                    // Comparing both values
                    if (s1 >= s2) {
                        // Value of current symbol
                        // is greater or equalto
                        // the next symbol
                        res = res + s1;
                    }
                    else {
                        // Value of current symbol is
                        // less than the next symbol
                        res = res + s2 - s1;
                        i++;
                    }
                }
                else {
                    res = res + s1;
                }
            }

            return res;
        }









    public static void main(String[] args) {


    RomanNumber obj = new RomanNumber();
        System.out.println(obj.romanToDecimal("LVIII"));


    }
}
