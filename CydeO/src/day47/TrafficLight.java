package day47;

import java.util.Locale;

public class TrafficLight {

    private String color;



    public void setColor(String color) {
       switch (color.toLowerCase()){
           case "red":
           case "yellow":
           case "green":
               this.color = color;
       }

    }
    public String getColor() {
        return color;
    }


    public TrafficLight(String color){
        setColor(color);


    }
}
