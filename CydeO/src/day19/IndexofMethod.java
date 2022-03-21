package day19;

public class IndexofMethod {
    public static void main(String[] args) {

        String s="peneneaddae";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("a"));  // if you do not have the characters you are looking for, you are not going to get error, instead of error output will be -1 !
        System.out.println(s.indexOf("en"));
        System.out.println(s.indexOf("nd"));
        System.out.println(s.indexOf("pz"));
        // if you have duplicate charachters, you will get first one!

        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.indexOf('e',7)); //  it gives the index number for the one comes after the index number we put. like if we put index 3, it is going to check the character comes after index 3 !!




    }
}
