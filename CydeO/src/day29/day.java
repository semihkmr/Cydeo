package day29;

public class day {
    public static void main(String[] args) {

        String str = "Today is monday";

        String [] words = str.split(" ");

        String reversed ="";
        for (int i = words.length-1; i >=0 ; i--) {

            reversed+=words[i]+" ";

        }
        System.out.println(reversed.trim());

    }
}
