package April21.Discord;

public class Admin extends DiscordUser {

    public Admin(String name, int id){
        super("Admin",name,id);
    }
    public void createChannel(){
        System.out.println("Creating new discord channel");
    }


}
