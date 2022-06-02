package day50_inheritance.book;

public class Library {

    public static void main(String[] args) {

        Book obj1 = new Book();

        AudioBook obj2 = new AudioBook();
        obj2.duration = 100;
        obj2.narrator = "Someone cool";
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        obj3.size = 20.4;
        obj3.pages = 1004;

        obj3.author = new Author("semih",20);

        obj3.title = "Soft skills is important";
        obj3.read();


        // using the updated author information

        Book obj4 = new Book();
        obj4.author = new Author("JK R", 40);
        // made an Author object. It belongs to the Book obj4 object
        System.out.println(obj4.author);
        System.out.println(obj4);
        System.out.println(obj4.author.getName());
        System.out.println();


        Author obj5 = new Author("ahmet",30);
        System.out.println(obj5.getName());
        System.out.println(obj5);



    }
}
