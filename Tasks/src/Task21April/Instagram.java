package Task21April;

public class Instagram extends App {

    public Instagram(double version, Phone phone){
        super("Instagram",version,phone);
    }

    public void postPicture(){
        System.out.println("Posting picture to " + appName);
    }


    /*
    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
     */

}
