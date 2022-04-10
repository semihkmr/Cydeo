package Task3April;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class RemoveDuplicates {
    public static ArrayList<Integer> RemoveDuplicate(ArrayList<Integer> numberArr) {

 ArrayList<Integer> result = new ArrayList<>();

                 for (int i = 0; i <numberArr.size() ; i++) {
                    int count=0;
                     for (Integer each:numberArr){
                      if(each == numberArr.get(i)){
                      count++;
                      }
                 }
                     if(count==1){
                         result.add(numberArr.get(i));
                     }
             }
             return result;

    }

    public static void main(String[] args) {

        ArrayList<Integer> numberArr = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(RemoveDuplicate(numberArr));
    }
        }

