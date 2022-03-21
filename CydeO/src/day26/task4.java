package day26;

public class task4 {
    public static void main(String[] args) {

        String [] str = {"apple","java","computer","water"};
        String small=str[0];
        String biggest=str[0];
        for (int i = 0; i < str.length ; i++) {


            if(str[i].length()>biggest.length()){
                biggest = str[i];
            }
            if(str[i].length()<small.length()){
                small= str[i];
            }


        }
        System.out.println(small);
        System.out.println(biggest);
        System.out.println(str.length);

    }
}
