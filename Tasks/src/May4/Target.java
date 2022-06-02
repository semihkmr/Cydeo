package May4;


 // we made a final, so there is no way we can make this class a parent class
public final class Target extends Shopping{



    @Override
    public void buyItem() {
        System.out.println("We bought from Target");

    }

    @Override
    public void returnItem() {
        System.out.println("Return to Target");

    }
}
