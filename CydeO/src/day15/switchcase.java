package day15;

public class switchcase {
    public static void main(String[] args) {
        // variable : value being checked// compared in the switch
        // on these types are allowed : byte , short , int , char , String
        // which means these types are not allowed : float, double , long , boolean
        // the datatype of the case should match the datatype of the variable being checked

        int n = 5;
        switch (n){
            case 1:
                System.out.println("one");
               break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;

        }


    }
}
