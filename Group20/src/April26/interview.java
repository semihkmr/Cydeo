package April26;

import java.util.ArrayList;
import java.util.Arrays;

public class interview {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));

        list.removeIf(each -> each.length() > 4  );

        System.out.println(list);
    }
}
