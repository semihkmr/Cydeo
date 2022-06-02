package April21.App;

public class App {

    String appName;
    double version;

    public App(String appName, double version) {
        this.appName = appName;
        this.version = version;
    }
    public void download(){
        System.out.println(appName + " is downloading version " + version);
    }

}
