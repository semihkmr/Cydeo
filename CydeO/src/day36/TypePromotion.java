package day36;

public class TypePromotion {
    public static void main(String[] args) {
        use(3);
        use(3.5);
        use(1.2f);
        use(3L);
        use(3F);
    }
    public static void use(float f){
        System.out.println("calling float number");
    }
    public static void use(double d){
        System.out.println("calling double number");
    }
    public static void use(long l){
       System.out.println("calling long number ");
   }
   /*
    whenever you give an argument it will try to match withe specified type
    but if the type is not matched directly it will try to automatically promote to the closest type bigger than it

    byte--> short--> int --> long-->float--> double
    if there is no type available, then the code will not compile
    Method overloading allows methods to be created with the same name
    The parameters must be different ( number of parameters, or the type of the parameters)
    The return types should be the same, but if a method is overloaded it can be changed
    Improve re-usability and readability

    */


}
