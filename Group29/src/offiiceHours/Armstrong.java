package offiiceHours;

public class Armstrong {
    public static void main(String[] args) {

   findArmstrongNumber(153);
    }
    public static void findArmstrongNumber(int number){

        int lastDigit=0;
        int totalDigits=0;
        int originalNumber=number;

        while(number>0){
            lastDigit=number%10;

            number/=10;
            totalDigits+=lastDigit*lastDigit*lastDigit;
        }
        if(totalDigits==originalNumber){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }


        }


