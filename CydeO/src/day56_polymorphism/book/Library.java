package day56_polymorphism.book;

public class Library {

    public static void main(String[] args) {

        JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java";
        book1.fun = true;
        book1.size = 20.5;

        book1.read();
        book1.download();
        book1.open();






        EBook book2 = new JavaTextBook();
        book2.name = "";
        book2.size = 10.5;
       //  book2.fun = it is not possible to access fun variable since it is located at child class
        ((JavaTextBook)book2).fun = true; // We did down casting here to access fun variable!!

        book2.open();
        book2.read();
        book2.download();


        Book book3 = new JavaTextBook();

        book3.name = "";
//        book3.size   It is not possible to access these two variable since those assigned in child class
        ((JavaTextBook)book3).size = 10.5; // down casting to access size variable from child class for the parent reference!
// This way is not a productive way to make down casting
//        book3.fun
        ((JavaTextBook)book3).fun = false; // down casting

        book3.read();
//        book3.download();  It is not possible to access these two methods since those assigned in child class
//        book3.open();



        Downloadable book4 = new JavaTextBook();
        book4.download();

        JavaTextBook book5 = (JavaTextBook)book4; // book5 is down casting now, it can be reusable

        book5.fun = true;
        book5.size = 12.3;
        book5.read();
        book5.open();
        book5.download();

    }


}
