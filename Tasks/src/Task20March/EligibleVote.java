package Task20March;

public class EligibleVote {
    public static void isEligible(int age ){
        if(age>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

    }

    public static void main(String[] args) {
        isEligible(21);
    }
}
