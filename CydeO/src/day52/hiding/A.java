package day52.hiding;

public class A {

    public void instanceMethodA(){
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("Static method from the PARENT class");
    }
}
