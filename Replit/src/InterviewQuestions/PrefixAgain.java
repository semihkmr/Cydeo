package InterviewQuestions;

public class PrefixAgain {

public static  boolean isPrefixAgain(String str, int num){

    String prefix = str.substring(0,num);
    return str.substring(num).contains(prefix);
}

    public static void main(String[] args) {

        System.out.println(isPrefixAgain("abXyca", 1));
        System.out.println(isPrefixAgain("zebraze",2));
        System.out.println(isPrefixAgain("abXYabc",3));

    }
}
