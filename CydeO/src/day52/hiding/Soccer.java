package day52.hiding;

public class Soccer extends Sports{

    public static void cheer(){
        System.out.println("Cheering from the Child class");
    }
}
/*
 it looks like we are overriding, but we are not, because the method is static

 we are hiding cheer method from the parent class
 */
