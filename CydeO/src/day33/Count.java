package day33;

public class Count {

    public static void count(int number){
        for (int i = 0; i <= number ; i++) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        count(10);
    }
}
