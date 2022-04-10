package offiiceHours;

import java.util.Arrays;

public class RemoveSpace {
    public static void removeSpace(String sentence) {
        String[] arr = sentence.split(" ");
        String removeSpace = "";

        for (int i = 0; i < arr.length; i++) {

            if (!arr[i].isEmpty()) {
                removeSpace += arr[i] + " ";
            }


        }
        System.out.println(removeSpace.trim());

    }

    public static void main(String[] args) {
        removeSpace("Hello world      I      love      Java    ");
    }
}
