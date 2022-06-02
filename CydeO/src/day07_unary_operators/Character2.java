package day07_unary_operators;

public class Character2 {
    public static void main(String[] args) {
        char new1 = 'A';

        System.out.println(new1++);
        System.out.println(new1++);
        System.out.println(new1++);
        System.out.println(new1++);
//        when we use post increment it take the value first than increase the value
//        when we use pre increment it take the value, increase and shows
        int i = 5; // i = 5
        int z = i++; // here: z = 5 (before incrementing the i),  but i = 6 now (after being incremented)

        System.out.println(i); // i now = 6
        System.out.println(z); // z still = 5 because it equals i before being incremented.
    }
}
