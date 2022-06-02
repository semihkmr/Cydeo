package Task17April;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("semih","adventure","james");

        book1.IDgenerator();

        System.out.println(book1);

        System.out.println(book1.IDgenerator());

        book1.setCategory("comics");

        System.out.println(book1.IDgenerator());

        System.out.println(book1);



        System.out.println(book1);


    }
}
