package day37;

public class ValueVSParse {
    public static void main(String[] args) {
        String s = "30";

        int seconds = Integer.parseInt(s) ; // converts the "30" String into an int of 30

    //    Integer i=  Integer.valueOf(s); // converts the "30" String into the Integer wrapper class object

        int i2 = Integer.valueOf(s); // Difference is with this we are getting int type not a Integer type. So we are not able to use .with methods
        int i3= Integer.parseInt(s);
        Integer i=  Integer.valueOf(s);
        System.out.println(i);
        System.out.println(i3);





    }
}
