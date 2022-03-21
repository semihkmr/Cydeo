package Task15March;
import java.util.Scanner;
public class multiplewords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        String [] arrayWords= words.split(",");
         String moreThan1Word="";
        for (int i = 0; i <arrayWords.length ; i++) {

            if(arrayWords[i].contains(" ")){
                moreThan1Word+=arrayWords[i];
            }



        }
        System.out.println(moreThan1Word);

    }
}
