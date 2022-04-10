package Task28MarchMemet;

public class Overloading {
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet <0||inches<0||inches>12){
            return -1;
        }

        double cm = ((feet*12)*inches)*2.54;
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }

        double feet = (int)inches/12;
         double remainingInches = inches%12;
        double cm=  calcFeetAndInchesToCentimeters(feet,remainingInches);


         return cm;
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(70));
        System.out.println(calcFeetAndInchesToCentimeters(5,10));
    }
}
