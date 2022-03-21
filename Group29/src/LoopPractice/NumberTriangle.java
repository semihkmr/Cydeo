package LoopPractice;

public class NumberTriangle {
    public static void main(String[] args) {
        int number = 11;
        for (int i = 0; i < 10; i++) {

            System.out.println("");
            number--;
            for (int j = 0; j < number; j++) {
                System.out.print(j + " ");


            }
        }
    }
}