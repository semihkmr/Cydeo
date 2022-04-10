package Task28MarchMemet;

public class Login {
    public static String getPassword(){
        return "Cydeo123";
    }
    public static String getUsername(){
        return "CYDEO";
    }
    public static boolean login(String username, String password){
        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;
    }
    public static boolean login(){
        String username= getUsername();
        String password = getPassword();
        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        boolean isLoginSuccess = login("Cydeo","Cydeo23");

        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        }
        else{
            System.err.println("Check your password");
        }
        System.out.println("============");

        isLoginSuccess=login();

       if(isLoginSuccess){
           System.out.println("Welcome to CYDEO");
       }else{
           System.err.println("Check your password");
       }


    }
}
