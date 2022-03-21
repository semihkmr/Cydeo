package day19;

public class day19 {
    public static void main(String[] args) {
        // How can I find the last index of a String
        // length - 1

    String s= "java";
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        // System.out.println(s.charAt(4));
        int secondtolastindex= s.length()-2;
        char secondtolastChar = s.charAt(secondtolastindex);
        System.out.println(secondtolastChar);



    }
}
