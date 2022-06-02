package Extra.inheritance.Employee;

public class Tester extends Employee{

    public Tester(String name, boolean isFullTime, int salary){
        super(name,isFullTime, salary, "Tester");
    }

    int bugsFound;

    public void test(){
        System.out.println("Running the regression");
    }
}
