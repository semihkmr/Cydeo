package Extra.Final;

public class FinalMethods {

    public final void method(){
        System.out.println("Java is fun");
    }
}
class B extends  FinalMethods{

    public static void main(String[] args) {

       FinalMethods obj1 = new FinalMethods();

      obj1.method();
    }

   // public void method(){
     //   System.out.println("Java not fun"); you can not override since it is a final method, no way to change the implementation!
    }

