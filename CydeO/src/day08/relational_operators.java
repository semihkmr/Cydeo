package day08;

public class relational_operators {
    public static void main(String[] args) {


        int b = 10; // b = 10 -- 11 -- 10
        b++; // post incremant, no other code, adds 1
        System.out.println(b);
        b--; // post decrement, no other code, subtract 1
        System.out.println(b); // print the value of b, which is 10
        System.out.println(b++); // post increment, we get the value first, which is 10, and we print, then we add 1
        System.out.println(b++); // post increment, we get the value first, which is 11,and we print it, then we add 1
        System.out.println(b); // we will see our value 12
    }
}
