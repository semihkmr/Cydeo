package day31;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        String [] allZone = zones.split(",");

        for(String eachZone : allZone){
            System.out.println(app+" is deployin on "+ eachZone);
        }
    }
}
