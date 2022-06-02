package day42;

public class AllPeople {

    public static void main(String[] args) {


        /*
         These are not valid ways to access instance variables
         System.out.println(Person.age);
         System.out.println(age);
         */

        Person  personOne = new Person(); // creates an object of the Person class

        Person personTwo = new Person();


        // Accessing the instance variables

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried = false;


        System.out.println(personOne.name);
        System.out.println(personOne.age);






    }
}
