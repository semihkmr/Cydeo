package Task20March;

public class CheckNumber {
    public static void checkNumber(int[] arr, int num){
        boolean hasNumber = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                hasNumber=true;

            }

            }
        System.out.println(hasNumber);

        }



    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5};
        int num= 10;
        checkNumber(arr,num);
    }
}
