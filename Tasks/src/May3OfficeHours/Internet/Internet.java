package May3OfficeHours.Internet;

public class Internet {
    public static void main(String[] args) {

        Browser obj1 = new Browser();
        obj1.openBrowser();
        obj1.closeBrowser();

        System.out.println();

        Chrome obj2 = new Chrome();
        obj2.openBrowser();
        obj2.closeBrowser();

        System.out.println();

        Opera obj3 = new Opera();
        obj3.openBrowser();
        obj3.closeBrowser();
    }
}
