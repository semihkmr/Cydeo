package Vesa1;

public class Q1 {

    public static String oddOrEven(int number){
        String result = "";
        if(number%2 == 0){
            result = "even";
        }
        else{
            result = "odd";
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(4));
        System.out.println(oddOrEven(5));
    }
}
