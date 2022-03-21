package recapsemih;

public class reverseString {

    public static void main(String[] args) {

        String name = "I Love You";

        System.out.println("reverseString(name) = " + reverseString(name));

    }

    public static String reverseString(String str){

        String reverse ="";
        for (int i = str.length()-1; i >=0; i--){
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
