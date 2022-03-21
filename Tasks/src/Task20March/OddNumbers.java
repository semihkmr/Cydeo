package Task20March;

public class OddNumbers {
    public static void evenNumbers(){
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
    }

    public static void oddNumbers(){
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }
    }

    public static void main(String[] args) {
        oddNumbers();
        System.out.println();
        evenNumbers();
    }
}
