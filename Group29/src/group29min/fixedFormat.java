package group29min;

public class fixedFormat {
    /*
    Fix Format
create a method will accept a String and return a String in proper format.
Proper format is:
First character starting as uppercase and the rest as lowercase
Ex:
Input:
jamES
Output:
James
     */

    public static String fixedFormat(String str){
        String fixed = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();

        return fixed;
    }

    public static void main(String[] args) {
        System.out.println(fixedFormat("JaMeS"));
    }

}
