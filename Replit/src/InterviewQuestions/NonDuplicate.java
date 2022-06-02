package InterviewQuestions;

public class NonDuplicate {

    /*
    [1, 2, 3, 4, 3, 4, 1]

Output:
  2
     */

    public static void findNonDuplicate(int[] arr){

         StringBuilder nonDuplicate = new StringBuilder();
        for(int number : arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(number == arr[i]){
                    count++;
                }

                }if(count == 1 ){
                    nonDuplicate.append(number);
            }
        }
        System.out.println(nonDuplicate);
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,2,4};

        findNonDuplicate(arr);
    }
}
