package day52.final_exam;

public class UseFinalExample {
    public static void main(String[] args){

        System.out.println(FinalExam.PLANET);
    //    FinalExam.PLANET = "Mars";  not possible since it is final

        FinalExam obj = new FinalExam(20);
        System.out.println(obj.a);
        System.out.println(obj.b);
      //   obj.a = 10;  not possible since it is final


    }
}
