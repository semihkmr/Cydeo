package InterviewQuestions;

public class Sandwich {


    public static String whatInside(String str) {
        /*
        breadxxxbread -> xxxx
         */

        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        if (firstBread < lastBread) {
            return str.substring(firstBread + 5, lastBread);
        }
        return "Nothing";
    }
    public static void main(String[] args) {
        System.out.println(whatInside("breadjambread"));
        System.out.println(whatInside("breadchickenbread"));
        System.out.println(whatInside("xxbreadyy"));
        System.out.println(whatInside("xxbreadbreadjambreadyy"));
    }
}
