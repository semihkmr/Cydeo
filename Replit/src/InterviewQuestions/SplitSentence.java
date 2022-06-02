package InterviewQuestions;

public class SplitSentence {

    public static void splitSentence(String str){

        String[] arr = str.split(" ");

        for (String s : arr) {
            System.out.println(s);

        }
    }

    public static void main(String[] args) {

        splitSentence("Java is fun");
        splitSentence("semih1");
    }
}
