package day33;

public class MyMathClass {
    public static void add(double numOne, double numTwo){
        System.out.println(numOne+numTwo);

    }
    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne-numTwo);}

    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne*numTwo);}


    public static void division(double numOne, double numTwo){
       if(numTwo!=0){
        System.out.println(numOne/numTwo);}
       else{
           System.err.println("can not divide by 0");}
    }


    public static void main(String[] args) {
        add(4.5,6.1);
        division(4,0);
    }
}
