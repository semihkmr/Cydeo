package day56_polymorphism.book;

public class JavaTextBook extends EBook{

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading java text");
    }

    @Override
    public void download() {
        System.out.println("Downloading java text");
    }

    @Override
    public void open() {
        System.out.println("Opening java tex");
    }
}
