package Task20March;

public class palindrome {

    public static void findPalindrome(String word){
        String reverse ="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= word.charAt(i);

        }
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome word");
        }
        else{
            System.out.println("It is not a palindrome word");
        }

    }

    public static void main(String[] args) {
        findPalindrome("anna");
    }
}
