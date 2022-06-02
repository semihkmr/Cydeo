package Extra.inheritance.Employee;

public class Employee {


   public String name;
   boolean isFullTime;
   private int salary;

   public double getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
     if(salary > 100){
        this.salary = salary;
     }
   }

   String role;


   public Employee(String name, boolean isFullTime, int salary, String role){
      this.name = name;
      this.isFullTime = isFullTime;
      setSalary(salary);
      this.role = role;
   }
   public Employee(String name,String role){
      this.name = name;
      this.role = role;
   }

   public void work(){
       System.out.println(name + " is working");

   }

   @Override
   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", isFullTime=" + isFullTime +
              ", salary=" + salary +
              ", role='" + role + '\'' +
              '}';
   }
}

