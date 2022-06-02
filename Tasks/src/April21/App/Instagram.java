package April21.App;

import April21.App.App;

public class Instagram extends App {

    public Instagram(double version){
        super("Instagram",version);

    }
    public void postPicture(){
        System.out.println("Posting picture to "+ appName);
    }
}
