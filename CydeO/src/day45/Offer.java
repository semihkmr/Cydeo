package day45;

public class Offer {
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

        public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }



    public String toString() {

        String info = company + " located in " + location;

        info += " \n " + (salary > 0 ? salary : "");

        info += " - " + (isFullTime ? "Full Time" : "Contract");

        info += " - " + (numberOfPTO > 0 ? numberOfPTO : "");

        return info + "\n";

    }
}
