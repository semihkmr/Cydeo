package Task5AprilMemet;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallTask {

    public static ArrayList<Integer> changeLastElement(ArrayList<Integer> list){

        list.remove(list.size()-1);
        list.add(0);
        return list;
    }
    public static  ArrayList<Integer> changeFirstToLast(ArrayList<Integer> list){
        int tempFirst = list.get(list.size()-1);
        int tempLast = list.get(4);

        list.remove(list.size()-1);
        list.remove(0);


        list.add(0,tempLast);
        list.add(tempFirst);

        return list;
    }
    public static ArrayList<Integer> multipleEachOdd(ArrayList<Integer> list){
        ArrayList<Integer> multipleArray = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            int eachNumber = list.get(i);

            if(eachNumber%2!=0){
                multipleArray.add(eachNumber*2);
            }
            else{
                multipleArray.add(eachNumber);
            }
        }
    return multipleArray;
    }
    public static ArrayList<String> combineTwoStringArray(String[] arr1,String[]arr2){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {
          list.add(arr1[i]);
        }
        int j = 0;
        for (int i = arr1.length; i < arr1.length+ arr2.length ; i++) {
            list.add(arr2[j]);
            j++;
        }
    return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(changeFirstToLast(list));
        System.out.println(changeLastElement(list));
        System.out.println(multipleEachOdd(list));

        String[] arr1 = {"book","pen","pencil"};
        String[] arr2 = {"Turkey","USA","Japan"};

        System.out.println(combineTwoStringArray(arr1,arr2));

    }

}
