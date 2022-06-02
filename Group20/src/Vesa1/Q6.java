package Vesa1;

public class Q6 {

    public static boolean isPrime(int number){

        for (int i = 2; i < number ; i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(5));
        System.out.println(isPrime(15));
        System.out.println(isPrime(13));
        System.out.println(isPrime(8));
    }
}
