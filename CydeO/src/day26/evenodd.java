package day26;

public class evenodd {
    public static void main(String[] args) {
        int [] number = {4,1,3,12,5};
        int odd = 0;
        int even = 0;
        for (int i = 0; i <number.length ; i++) {

            if(number[i]%2==0){
                even++;
            }
            if(number[i]%2!=0){
                odd++;
            }

        }
        System.out.println(even);
        System.out.println(odd);
    }
}
