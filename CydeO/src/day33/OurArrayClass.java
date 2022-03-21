package day33;

public class OurArrayClass {

    public static void firstElement(int[] nums){
        System.out.println("First Element: " + nums[0]);
    }
    public static void lastElement(int[] nums ){
        System.out.println("Last Element: " + nums[nums.length-1]);
    }

    public static void elements(int[] nums){
        if(nums.length%2==0){
            System.out.println("Two middle Element: "+ nums[(nums.length/2)-1] + " "+ nums[(nums.length/2)]);
        }
        else{
            System.out.println("One middle Element: " + nums[(nums.length/2)]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,12,5,4};

        firstElement(new int[] {1,2,3});
    }
}
