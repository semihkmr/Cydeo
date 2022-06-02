package May28.task3;

import java.util.function.Consumer;

public class UseConsumer {

    public static void main(String[] args) {


        Consumer<Integer []> firstAndLast = arr -> {

            if(arr.length>0) {
                System.out.println("first number= "+arr[0]);
                System.out.println("last number= "+arr[arr.length - 1]);
            }
        };

        Consumer<String> middle=(n)->{
            int l=n.length();
            if(l%2==0){
                System.out.println(""+n.charAt((l/2)-1)+n.charAt(l/2));
            }else{
                System.out.println(n.charAt(l/2));
            }
        };

    }


}
