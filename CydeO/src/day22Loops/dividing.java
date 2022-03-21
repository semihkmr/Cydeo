package day22Loops;

public class dividing {
    public static void main(String[] args) {
        int a = 99;
        int b = 2;
        int count = 0;
        while(a>=b){
            a-=b;
        count++;
        }
        System.out.println(count);
    }
}
