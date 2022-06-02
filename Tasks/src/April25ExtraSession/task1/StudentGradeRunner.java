package April25ExtraSession.task1;
import java.util.Scanner;
public class StudentGradeRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many question");
        int numQuestion = sc.nextInt();

        System.out.println("How many question missed");
        int numMissed = sc.nextInt();

        FinalExam student1 = new FinalExam(numQuestion, numMissed);

        student1.calcNumericScore();
       // System.out.println(student1.numericScore);
        System.out.println(student1.getGrade());







    }


}
