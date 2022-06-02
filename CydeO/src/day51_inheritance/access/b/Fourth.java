package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Fourth extends First {
    public static void main(String[] args) {

        Fourth obj = new Fourth();
        System.out.println(obj.one);
        System.out.println(obj.two);
    //    System.out.println(obj.three);
    //    System.out.println(obj.four);

        // to access the protected variable, we need extends from the class where protected variable defined. We still can not
        // access directly, so we have to use fourth obj!!
    }
}