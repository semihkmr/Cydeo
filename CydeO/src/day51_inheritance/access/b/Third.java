package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
     //   System.out.println(obj.two);   this is protected, not accessible
     //   System.out.println(obj.three);  default , not accessible
     //   System.out.println(obj.four);   private not accessible


    }
}
