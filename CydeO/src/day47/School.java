package day47;

public class School {
    public static void main(String[] args) {

        CydeoStudent emre = new CydeoStudent("Emre",5);

        System.out.println();
        System.out.println(emre);

        System.out.println();
        CydeoStudent.printInfo();
        System.out.println("---");
        emre.printInfo();

        System.out.println();

        System.out.println(CydeoStudent.instructors[0]);

    }
}
