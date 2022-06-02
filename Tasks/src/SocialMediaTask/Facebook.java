package SocialMediaTask;

import java.util.ArrayList;
import java.util.List;

public class Facebook extends SocialMedia {

    private int age;
    private int numberOfFriends;
    private List<Post> post;


    static {
        platform = "Facebook";
    }

    public Facebook(String userName, String password){

        this.userName = userName;
        setPassword(password);
        personalUrl = "Facebook.com/" + userName;
        post = new ArrayList<>();

    }
    public Facebook(String userName, String password, String personalUrl){

    }
    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(userName)) {
            System.out.println("Password should not contain the username, default password set");
            this.password = "default";
        } else {
            this.password = password;
        }
    }


    @Override
    public void directMessaging(String userName, String message) {

    }

    @Override
    public void post(Object media) {

    }

    @Override
    public void notification() {

    }
}
