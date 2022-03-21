package task13march;
import java.util.Scanner;
public class gradebook {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String []  name= new String[5];
     int [] score = new int[5];
     char [] grade = new char[5];
        for (int i = 0; i <name.length ; i++) {
            System.out.println("Please enter the name of the student");
            name[i] = sc.nextLine();
        }
        for (int i = 0; i <score.length ; i++) {
            System.out.println("Please enter the score of the student");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i <grade.length ; i++) {
            if(score[i]>85){
                grade[i]='A';
            }
            else if(score[i]>75){
                grade[i]='B';
            }
            else if(score[i]>65){
                grade[i]='C';
            }
            else{
                grade[i]='D';
            }


        }

        System.out.println(name[0]+" | "+score[0]+" | "+grade[0]+" |");
        System.out.println(name[1]+" | "+score[1]+" | "+grade[1]+" |");
        System.out.println(name[2]+" | "+score[2]+" | "+grade[2]+" |");
        System.out.println(name[3]+" | "+score[3]+" | "+grade[3]+" |");
        System.out.println(name[4]+" | "+score[4]+" | "+grade[4]+" |");



    }
}
