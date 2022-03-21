package day17;

public class Stringmemory {
    public static void main(String[] args) {

      String first = "java";  // String literal, in String pool

      String second = new String("java"); // String object , not in String pool , but directly in the heap
        System.out.println(first == second);

        // == with String types gives you false. The == does not compare characters, it compare the memory location of the object
        String third = "java";
        System.out.println(first == third);

      //  byte x = 5;
     //   int y = 5;
     //   System.out.println(x==y); --> this is true
      String fourth = "Java";
        System.out.println(first==fourth);

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));

        System.out.println("today was fun".length());
    }
}

