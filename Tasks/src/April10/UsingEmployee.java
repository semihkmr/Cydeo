package April10;

public class UsingEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Semih" , "Test Engineer");

        Employee employee2 = new Employee("Semih", 1201,"Test Engineer",100000);

        employee1.goGetMeeting();

        System.out.println(employee1);
        System.out.println(employee2);


    }
}

