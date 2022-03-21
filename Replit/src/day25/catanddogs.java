package day25;
import java.util.*;
public class catanddogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int countDog=0;
        int countCat=0;

        for (int i = 0; i <str.length()-2 ; i++) {
            String everyDog = str.substring(i, i + 3);

            if (everyDog.equals("dog")) {
                countDog++;
            }
            String  everyCat = str.substring(i,i+3);
            if(everyCat.equals("cat")){
                countCat++;
            }

        }
        if(countCat==countDog){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
