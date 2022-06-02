package Extra.inheritance.Employee;

public class Developer extends Employee{

    int featureCreated;

    public Developer(String name){
        super(name,"tester");

    }
    public Developer(String name, boolean isFullTime, int salary){
        super(name,isFullTime,salary,"Tester");
    }

//    public Developer( String name,boolean isFullTime, double salary){
//        super(name,isFullTime,salary,"Developer");




    public void develop(){
        System.out.println("Creating more feature");
    }


}
