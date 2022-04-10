package ArrayHard;

import java.util.ArrayList;

// 1,2,3,4    2,3
//  1,2,3,4    6,7,8
// 1,2,3,4    1,2,3
public class LinearIn {

    public static Boolean hasAllArray(int[] outer,int[] inner ){

        ArrayList<Integer>  outerArrayList = new ArrayList<>();
        ArrayList<Integer>  innerArrayList = new ArrayList<>();

         for(int each:outer){
             outerArrayList.add(each);

         }
         for(int each:inner){
             innerArrayList.add(each);
         }

        for (int i = 0; i < outerArrayList.size() ; i++) {
            int outerNumber = outerArrayList.get(i);

            for (int j = 0; j < innerArrayList.size() ; j++) {
            int innerNumber = innerArrayList.get(j);

            if(innerNumber == outerNumber ){
                  innerArrayList.remove(j);
              }
            }
        }
        if(innerArrayList.size()==0){
            return true;
        }
return false;
    }

    public static void main(String[] args) {
        int [] outer = {1,2,3,4};
        int [] inner = {1,3,5};

        System.out.println(hasAllArray(outer,inner));
    }
            }


