package Task20March;

public class CheckTriangle {
    public static void checkAngle(int num,int num1,int num2){
        if(num+num1+num2==180){
            System.out.println("This is a triangle");
        }
        if(num+num1+num2==360){
            System.out.println("This is a circle");
        }

    }

    public static void main(String[] args) {
        checkAngle(100,80,180);
    }
}
