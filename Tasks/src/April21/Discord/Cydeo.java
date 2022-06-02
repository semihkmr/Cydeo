package April21.Discord;

public class Cydeo {
    public static void main(String[] args) {

        DiscordUser obj1 = new DiscordUser("mentor","ahmet",1007);
        System.out.println(obj1);
        System.out.println();

        Admin obj2 = new Admin("memet",1988);
        obj2.createChannel();
        System.out.println(obj2);
        System.out.println();

        Student obj3 = new Student("semih",2211);
        obj3.sendMessage();
        System.out.println(obj3);

    }
}
