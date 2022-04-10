package InterviewQuestions;

import java.util.Arrays;

public class ReverseSentence {
    public static void reverseSentence(String sentence){

   String [] arr = sentence.split(" ");
     int j =0;
     String [] reverseArr = new String[arr.length];
        for (int i = arr.length-1; i >= 0 ; i--) {

            reverseArr[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reverseArr));
     }

     public static void main(String[] args) {

        String sentence = "I love kiwi Semih";
        reverseSentence(sentence);
    }
}
