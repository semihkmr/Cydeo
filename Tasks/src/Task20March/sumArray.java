package Task20March;

public class sumArray {
    public static void sumArr(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length ; i++) {
           total+=arr[i];
        } System.out.println("Sum of the array: "+ total);
    }

    public static void main(String[] args) {

        int[] newArr= {1,2,3,4};
        sumArr(newArr);
    }
}
