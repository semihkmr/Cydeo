package Alistirma;

public class Library {

    public static void main(String[] args) {

       Book ob1 = new Book();

       AudioBook obj2 = new AudioBook();
        obj2.duration = 100;
        obj2.narrator = "Someone cool";
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        obj3.size = 20.4;
        obj3.pages = 1004;

        obj3.title = "Soft skills is important";
        obj3.read();

        Book obj4 = new Book();
        obj4.title = "ddwd";
        //obj4.author = new Author("JK R",40);
        obj4.read();


        System.out.println(obj4);


        Author obj5 = new Author("sk", 20);
        System.out.println(obj5);


    }
}
