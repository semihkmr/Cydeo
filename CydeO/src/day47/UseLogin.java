package day47;

public class UseLogin {

    public static void main(String[] args) {

        Login obj = new Login();

       // obj.username = "jamesbond"
       // obj.password = "1234";

       // can not access private variables directly

       obj.setUsername("jamesbond");
       obj.setPassword("123222224");

 //       System.out.println(username);

 //      System.out.println(password);




        System.out.println(obj.getPassword());
        System.out.println(obj.getUsername());


    }
}
