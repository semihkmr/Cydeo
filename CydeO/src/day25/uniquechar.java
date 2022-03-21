package day25;
import java.util.Scanner;
public class uniquechar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String checkedString= "";
        String uniqueChar="";
        boolean isUnique=true;

        for (int i = 0; i <str.length() ; i++) {
             isUnique=true;
            checkedString=""+str.substring(0,i)+ str.substring(i+1,str.length());


                if(checkedString.contains(""+str.charAt(i))){
                    isUnique=false;
                }
                if(isUnique){
                uniqueChar+=""+str.charAt(i);
            }


            }
        System.out.println(uniqueChar);
        }

    }

