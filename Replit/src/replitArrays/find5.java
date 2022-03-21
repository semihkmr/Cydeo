package replitArrays;
import java.util.Scanner;
public class find5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int[] nums = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        boolean has5=false;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==5){
                if(nums[i]==nums[i+1]){
                    has5=true;
                }
            }

        }
        System.out.println(has5);
    }
}
