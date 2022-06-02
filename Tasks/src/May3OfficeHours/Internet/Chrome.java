package May3OfficeHours.Internet;

public class Chrome extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}
