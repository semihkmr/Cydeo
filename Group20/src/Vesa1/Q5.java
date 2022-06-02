package Vesa1;

public class Q5 {

    public static void divisible(int number){
        StringBuilder divisible15 = new StringBuilder();
        StringBuilder divisible3 = new StringBuilder();
        StringBuilder divisible5 = new StringBuilder();

        for (int i = 1; i <= number ; i++) {
            if(i%3 == 0 && i%5 == 0){
                divisible15.append(i).append(" ");
            }
            if (i%3 == 0 && i%5 != 0){
                divisible3.append(i).append(" ");
            }
             if(i%5 == 0 && i%3 != 0){
                divisible5.append(i).append(" ");
            }
        }
        System.out.println("divisible by 15: " + divisible15);
        System.out.println("divisible by 5: " + divisible5);
        System.out.println("divisible by 3: " + divisible3);

    }

    public static void main(String[] args) {

        divisible(100);
    }
}
