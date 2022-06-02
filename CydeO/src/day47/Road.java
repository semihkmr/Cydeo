package day47;

public class Road {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("blue");

       // System.out.println(light.color);

       System.out.println(light.getColor());

       TrafficLight light2 = new TrafficLight("red");

        System.out.println(light2.getColor());

        light2.setColor("blue");
        System.out.println(light2.getColor());


    }
}
