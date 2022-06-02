package day08_relational_operators;

public class operators2 {
    public static void main(String[] args) {
        int a = 40;
        System.out.println(--a); // pre decrement so 39
        System.out.println(--a); // pre decrement so 38
        System.out.println(a--); // post decrement so 38
        System.out.println(--a); // post decrement so 36 because of the code above made it 37
        System.out.println(--a); // pre decrement so 35
        System.out.println(a--); // post decrement so 35
    }
}
