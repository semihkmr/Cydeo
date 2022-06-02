package April10;

public class Offer {

    String location;
    String company;
    int salary;
    boolean isFullTime;
    int number_Of_PTO;

    public Offer(String company, String location){

        this.company = company;
        this.location = location;
    }
    public Offer(String company, String location, int salary){

        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    public Offer(String company, String location, int salary, boolean isFullTime, int number_Of_PTO){

        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.number_Of_PTO = number_Of_PTO;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", number_Of_PTO=" + number_Of_PTO +
                '}';
    }

}
