package Task21April;

public class App {

    /*
    Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version
     */
    String appName;
    double version;
    Phone phone;

    public App(String appName, double version, Phone phone) {
        this.appName = appName;
        this.version = version;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", version=" + version +
                ", phone=" + phone +
                '}';
    }
}

