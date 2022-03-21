package day18;

public class day19recap {
    public static void main(String[] args) {


        String s = "pen";
        String s2 = new String("pen");

        System.out.println("Compare " + (s== s2));

        System.out.println("Compare with equals() " + (s.equals(s2)));
        System.out.println(s.equalsIgnoreCase("Pen"));

        // String methods
        // general syntax : stringObject.method()

        // equals(): checks if the Strings value/objects have the same characters --> return boolean true or false
        // --> cares about case sensitivity
        // equalsIgnoreCase() : checks if the String value/objects have the same characters, but ignores case sensitivity
        //  length() --> tells you how many characters
// isEmpty() --> checks if your string has characters or not. If there is no characters, it is empty return boolean
        // isBlank() --> checks if your String has a any characters or not. returns boolean
        // trim() --> this is the method remove space into String from beginning or ending, if the space is in the middle it is not doing anything for that!!


    }
}