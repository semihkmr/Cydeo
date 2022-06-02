package day06_arithmetic_operations;

public class calculations {
    public static void main(String[] args) {
        int currentYear = 2022;
        int birthYear = 1984;
        int age = currentYear - birthYear;
        System.out.println(age);

        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;

        //WRITE YOUR CODE BELOW:
        double ticketPrice = basePrice + (milesBetweenCities / rate);
        System.out.println("The ticket price from " + cityOne + "to" + cityTwo + "is" + ticketPrice);
    }
}
