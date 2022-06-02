package April25ExtraSession.task1;

public class FinalExam extends GradeActivity{

 public int numQuestion;
 public double pointsEach;
 public int numMissed;
 public double numericScore;
  public FinalExam(int numQuestion, int numMissed){
     this.numQuestion = numQuestion;
     this.numMissed = numMissed;
 }

 public  void calcNumericScore(){
     pointsEach = 100 / numQuestion;

     numericScore = (100- (numMissed*pointsEach));
     setScore(numericScore);




 }

}
