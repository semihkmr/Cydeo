package day18;

public class RemoveSpace {
    public static void main(String[] args) {
        String s="         Saturday    ";
        System.out.println(s);
        System.out.println(s.length());

        s = s.trim(); // remove space from beginning and end only
        System.out.println(s);
        System.out.println(s.length());

    }
}
