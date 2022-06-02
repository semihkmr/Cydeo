package Encapsulation;

public class Task1 {

    public String name;

    private String name2;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
       if(name2.length()>5){

        this.name2 = name2;}
    }
}
