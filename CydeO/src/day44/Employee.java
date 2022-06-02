package day44;

public class Employee {

    String name;
    int id;
    String jobTitle;
    int salary;

    public Employee(String jobTitle,String name){

        this.name = name;
        this.jobTitle = jobTitle;
    }


    public Employee(String name, int id, String jobTitle, int salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
