package day37;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2022";

        System.out.println("This year " + year);
        System.out.println("Next year will be "+ (year+1));

        int numYear = Integer.parseInt(year);

        System.out.println("This year " + numYear);
        System.out.println("Next year will be " + (numYear+1));
    }
}
