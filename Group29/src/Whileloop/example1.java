package Whileloop;

public class example1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++)
            System.out.println("Hello World");


        System.out.println("-----------------");

        int sum = 0;
        for (int y = 40; y <= 120; y++) {
            sum = sum + y;
        }
            System.out.println("Sum of y " + sum);


        System.out.println("------------------");

         int z=1;
         while(z<5){
             System.out.println("Hello Semih");
         z++;
         }
         System.out.println("-------------");
    int t=1;
    do {
        System.out.println("Hello Dani");
        t++;}
        while(t<=5);

// As you see below, same number I mean from 1 to 6 , when you use the while loop it print 4 time because when we use the while loop it checks condition first than print statement. on the other hand, when we use do while it print 5 times, reason for that do while print the statement first than it checks if is true or not!!

// We use the do while loop if we have to print statement at least one time
    }
}
