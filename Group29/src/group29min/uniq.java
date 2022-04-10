package group29min;

public class uniq {
    /*
    Unique Characters
create a method that will accept a word(String) and return a String with
all the unique characters. A character is unique if it only appears in the
String once.
Hint: use your frequency method to do some of the work
Ex:
Input:
aaaaabcccdeeff
     */
    public static String uniqueChar(String str){
        String str1 = "";

        for (int i = 0; i < str.length() ; i++) {
            int count= 0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChar("aaaaabcccdeeff"));
    }
}
