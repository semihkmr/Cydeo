package day06;

public class employment {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle, officeAddress;
        int salary, startDay, startMonth, startYear;
        boolean fulltime = true;

        firstName = "Noah";
        lastName = "Smith ";
        companyName = "Apple";
        jobTitle = "SDET";
        officeAddress = "One Apple Way, Cupertino, CA 95014";
        salary = 200_000;
        startDay = 10;
        startMonth = 1;
        startYear = 2022;

        String fullName = firstName + " " + lastName;
        String fullStartDate = (startMonth + "," + startYear);
        String email = (firstName + startDay + "@" + companyName + ".com");

        double salaryAfter2Year = (salary * 0.15) + salary;

        System.out.println("Employee Information" + "\n" + "We have " + fullName + " joining " + companyName + "\n" + firstName + " will start on " + fullStartDate + " as full time: " + "\n" + fulltime + "\n" + firstName + " here is some information about your employment" + "\n" + "Your email is " + email + "\n" + "Your base salary is $" + salary + " and after 2 years it will be " + "$" + (int) salaryAfter2Year + "\n" + "Welcome aboard, see you at " + officeAddress);
    }
}
