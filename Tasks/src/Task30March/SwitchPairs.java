package Task30March;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {

    public static ArrayList<String> SwitchPair(ArrayList<String> arr){

        ArrayList<String> switchPair = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
             i++;
            String str = arr.get(i);

            arr.remove(i);

            arr.add(i-1,str);

        }
        return arr;

    }

    public static void main(String[] args) {

        String[] stringArr = {"Cat","in","the","hat"};

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(stringArr));

        System.out.println(SwitchPair(arr));
     }
}
