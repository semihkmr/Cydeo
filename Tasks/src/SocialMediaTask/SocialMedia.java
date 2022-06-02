package SocialMediaTask;

public abstract class  SocialMedia {

  protected   String personalUrl;
  protected   int accountLength;
  protected   String userName;
  protected   String password;
  protected   String fullName;

    static String platform;

    public abstract void directMessaging(String userName, String message);

    public abstract void post(Object media);

    public abstract void notification();


}
