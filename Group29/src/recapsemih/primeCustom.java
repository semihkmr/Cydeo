package recapsemih;

public class primeCustom {
    public static void main(String[] args) {
        int nmr =15;
        int nmr2=11;
        System.out.println("isPrime(nmr) = " + isPrime(nmr));
        System.out.println("isPrime(nmr2) = " + isPrime(nmr2));

    }

    public static boolean isPrime(int number){

        for (int i = 2; i <number-1 ; i++) {
            if(number%i==0){
               return false;
            }

        }
        return true;


    }
}





