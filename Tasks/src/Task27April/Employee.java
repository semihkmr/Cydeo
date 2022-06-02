package Task27April;

public abstract class Employee extends Person{


    String jobTitle;
    double salary;

    @Override
    public void hobby() {

    }
    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
