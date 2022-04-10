package day34;

public class CreditScore {
    public static int getCreditScore(){
        return 800;
    }
    public static boolean isGoodCreditScore(int creditScore){
        if(creditScore>=700){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isGoodCreditScore(getCreditScore()));
        System.out.println(isGoodCreditScore(500)?"Good Score" : "Bad Score");
    }
}
