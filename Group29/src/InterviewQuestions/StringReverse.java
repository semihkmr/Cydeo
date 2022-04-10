package InterviewQuestions;

public class StringReverse {
    public static void  reverseStr(String word){
        String reverseWord = "";
        for (int i =word.length()-1; i >=0 ; i--) {
            reverseWord+= word.charAt(i);

        }
        System.out.println(reverseWord);
    }

    public static void main(String[] args) {
  reverseStr("semih");
    }
}
