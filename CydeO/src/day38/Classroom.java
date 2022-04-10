package day38;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());

        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Neli");

        System.out.println(group);
        System.out.println(group.size());

        System.out.println("First studen: "+ group.get(0));
    }
}
