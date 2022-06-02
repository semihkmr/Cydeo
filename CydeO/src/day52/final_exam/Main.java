package day52.final_exam;

public class Main {
    public static void main(String[] args) {

        new Parent().walk();
        new Child().walk();
    }
}
class Parent{

    public final void walk(){
        System.out.println("You are walking");
    }

}

class Child extends Parent{


}
