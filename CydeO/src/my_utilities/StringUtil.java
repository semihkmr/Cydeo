package my_utilities;

import java.util.Locale;

public class StringUtil {
    /*
     reverse
     create a method that will accept a String and return reversed version
     */
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }

    public static String fixedFormat(String word) {

        String fixed = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        return fixed;

    }

    public static String CamelCase(String sentence) {
        String[] arr = sentence.split(" ");
        String fixedSentence = "";
        for (String each : arr) {
            fixedSentence += each.substring(0, 1).toUpperCase() + each.substring(1).toLowerCase();
        }
        fixedSentence = fixedSentence.substring(0, 1).toUpperCase() + fixedSentence.substring(1);
        return fixedSentence;
    }

    public static int frequencyChar(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static String uniqueChar(String str) {
        String checkedString = "";
        String uniqueChar = "";
        boolean isUnique = true;
        for (int i = 0; i < str.length(); i++) {
            isUnique = true;
            checkedString = "" + str.substring(0, i) + str.substring(i + 1, str.length());


            if (checkedString.contains("" + str.charAt(i))) {
                isUnique = false;
            }
            if (isUnique) {
                uniqueChar += "" + str.charAt(i);
            }
        }
        return uniqueChar;
    }

    public static String duplicateChar(String str) {
        String duplicate = "";
        String checked = "";
        boolean isDuplicate = false;
        for (int i = 0; i < str.length(); i++) {
            isDuplicate = false;

            checked = str.substring(0, i) + str.substring(i + 1, str.length());
            if (checked.contains(str.charAt(i) + "")) {
                isDuplicate = true;
            }
            if (isDuplicate) {
                if (!duplicate.contains("" + str.charAt(i))) {
                    duplicate += "" + str.charAt(i);
             }
            }
        }
        return duplicate;
    }

}

