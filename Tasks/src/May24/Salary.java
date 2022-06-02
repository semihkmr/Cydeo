package May24;

import java.util.HashMap;
import java.util.Map;

public class Salary {

    public static void main(String[] args) {


        Map<String, Double> hashmap = new HashMap<>();

        hashmap.put("James", 200000.0);
        hashmap.put("John", 150000.0);
        hashmap.put("Semih", 125000.0);
        hashmap.put("Alex", 175000.0);
        hashmap.put("George", 225000.0);
        hashmap.put("Kelly", 179000.0);

        String nameForHighest = "";
        double maxSalary = 0.0;
        double minSalary = Double.MAX_VALUE;
        String nameForLowest = "";

        // Who has the max salary nad min salary
        for (String key : hashmap.keySet()) {

            double value = hashmap.get(key);

            if (value > maxSalary) {
                nameForHighest = key;
                maxSalary = value;
            }
            if (value < minSalary) {
                nameForLowest = key;
                minSalary = value;
            }
        }
        // How many employees has the salary between 120 - 150k
        int counter = 0;
        for (double value : hashmap.values()) {
            if (value >= 120000 && value <= 150000) {
                counter++;
            }
        }
        for (String name : hashmap.keySet()) {
            if (hashmap.get(name) <= 218_000) {
                System.out.println(name);
            }
        }
        for (String key : hashmap.keySet()) {
            hashmap.put(key, hashmap.get(key) + 10_000);
        }
        System.out.println(hashmap);




        System.out.println("nameForHighest + maxSalary = " + nameForHighest + maxSalary);
        System.out.println("nameForLowest + minSalary = " + nameForLowest + minSalary);


    }
}
