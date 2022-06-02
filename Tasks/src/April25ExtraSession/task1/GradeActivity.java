package April25ExtraSession.task1;

public class GradeActivity {

    double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {

        if ( getScore() > 90) {
            return 'A';
        }
        else if( getScore() > 80){
            return  'B';
        }
        else if( getScore() > 70){
            return  'C';
        }
        else if( getScore() > 60){
            return  'D';
        }
        else{
            return 'F';
        }

    }
}