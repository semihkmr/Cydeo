package replitArrays;
import java.util.Scanner;
public class nonduplicate {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int[] nums = {sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int count=0;
        String nonDuplicate="";
        for (int i = 0; i <nums.length ; i++) {
            count=0;

            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count==1){
                nonDuplicate+= nums[i];
            }

        }


        System.out.println(nonDuplicate);


    }

}
