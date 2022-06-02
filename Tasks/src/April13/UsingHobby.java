package April13;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingHobby {

    public static void main(String[] args) {

        Hobby hobby1 = new Hobby("Golf");
        Hobby hobby2 = new Hobby("Bowling", 12.99);
        Hobby hobby3 = new Hobby("Tennis", 5.99, true, true);

        Hobby[] list = {hobby1,hobby2,hobby3};

        ArrayList<Hobby> allhobbies = new ArrayList<>(Arrays.asList(list));

        System.out.println(allhobbies);

        allhobbies.add(new Hobby("fishing", 0, true, false));

        System.out.println("------------");
        System.out.println(allhobbies);

        allhobbies.addAll(Arrays.asList( new Hobby("Swimming", 0, true, false),new Hobby("Reading a book", 0, false, false)));

        System.out.println("------------");
        System.out.println(allhobbies);

        allhobbies.removeIf(each -> each.isOutDoor == false);

        System.out.println("-----------");
        System.out.println(allhobbies);



    }
}
