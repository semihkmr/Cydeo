package Vesa1;

public class Q3 {

    public static void finra(int number){

        for (int i = 0; i <= number ; i++) {
            if(i%3 == 0 && i%5 ==0){
                System.out.println("FINRA");
            }
            else if(i%3 == 0){
                System.out.println("FIN");
            }
            else if(i%5 == 0){
                System.out.println("RA");
            }
            else{
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {

        finra(50);
    }
}
