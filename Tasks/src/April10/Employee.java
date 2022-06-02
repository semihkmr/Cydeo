package April10;

public class Employee {

    String name;
    int id;
    String job_title;
    int salary;

    public Employee(String name, String job_title){

      this.name = name;
      this.job_title = job_title;

    }
    public Employee(String name, int id, String job_title, int salary){

        this.name = name;
        this.id = id;
        this.job_title = job_title;
        this.salary = salary;
    }
    public void goGetMeeting(){

         System.out.println(name + " is going to meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", job_title='" + job_title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
