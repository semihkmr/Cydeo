package day63_functional_interface;

public class CallPredicateMethod {


    public static void main(String[] args) {


        System.out.println("UsePredicate.isPalindrome.test(\"semih\") = " + UsePredicate.isPalindrome.test("semih"));
        System.out.println("UsePredicate.isPalindrome.test(\"racecar\") = " + UsePredicate.isPalindrome.test("racecar"));


        System.out.println(UsePredicate.isPrime.test(3));
        System.out.println(UsePredicate.isPrime.test(8));
    }
}
