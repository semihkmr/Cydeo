package April21.App;

public class Phone {
    public static void main(String[] args) {

        App obj1 = new App("Twitter",9.82);
        obj1.download();
        System.out.println();

        Instagram obj2 = new Instagram(10.2);
        obj2.download();
        obj2.postPicture();
        System.out.println();

        Youtube obj3 = new Youtube(11.2);
        obj3.download();
        obj3.watchVideo();
    }
}
