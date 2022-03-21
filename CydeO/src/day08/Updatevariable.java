package day08;

public class Updatevariable {
    public static void main(String[] args) {
        // adding 1 to variable
        int a = 10;
        a = 11;
        a++;
        ++a;
        a = a + 1;

        // add 10 to the variable

        int b = 4;
        // 10 times I write b++;
        b = 14;
        b = b + 10; // reads the value of b, adds 10 to it, then the result is store back into b by reassignin

        b += 10; // this code is the same as b = b+10;

        int count = 0;
        count += 5;
        System.out.println(count);


    }
}
