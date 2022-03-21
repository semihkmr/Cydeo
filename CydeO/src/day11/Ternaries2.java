package day11;

public class Ternaries2 {
    public static void main(String[] args) {
        int score = 70;

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';


        System.out.println(grade);
    }

}
