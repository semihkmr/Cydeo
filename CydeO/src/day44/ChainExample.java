package day44;

import java.sql.SQLOutput;

public class ChainExample {

    public ChainExample(){
        System.out.println("First");
    }
    public ChainExample(int i){
        this();
        System.out.println("Second");

    }
    public ChainExample(String s){
        this();
        System.out.println("Third");
    }
    public ChainExample(double d){
        this("s");
        System.out.println("Fourth");
    }

}
