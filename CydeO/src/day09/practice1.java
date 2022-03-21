package day09;

public class practice1 {
    public static void main(String[] args) {
        boolean weekend = true;
        boolean teacher = true;
        boolean police_officer = false;
        boolean firefighter = false;

        boolean discount = (weekend && teacher || police_officer || firefighter);
        System.out.println(discount);
    }
}
