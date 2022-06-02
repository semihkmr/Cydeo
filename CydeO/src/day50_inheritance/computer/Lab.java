package day50_inheritance.computer;

public class Lab {

    public static void main(String[] args) {

        Computer obj1 = new Computer("generic os", 300);

        System.out.println(obj1);

        Windows obj2 = new Windows(90);
        System.out.println(obj2);

        Mac obj3 = new Mac(200);
        System.out.println(obj3);
        /*
        constructor is ot inherited
        the child class constructor must always call the parent class constructor
        using super() we can call the parent constructor

        -> What is the difference between this vs super
        this : reference of the current object
        super: reference of the parent class object

        -> What is the difference between this() vs super()
        this() : used to chain the constructor in the same class
        super() : used to call the parent constructor from a different class

        Object class
            the parent of all classes
            located in the java.lang package
            - does not need to be defined, it is automatically inherited

            -- Take a look at the Book class from today
            we originally had String author but this was only a String type so it could only have characters.
            We made a seperate Author class, so be able to define the information of an Author better
            That allowed us to replace the String author with Author

            -> Author author
                became an instance variable, it belongs to the objects of the class, which were Book objects

           summary : Give us more information about author

         */
    }
}
