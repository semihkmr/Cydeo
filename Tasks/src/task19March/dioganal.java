package task19March;

public class dioganal {
    public static void main(String[] args) {
        int [][] numbers = {{3,5,1},{1,6,10},{5,21,10}};

        int first = 0;
        int second = 0;
        int count = 0;
        int count1=numbers.length-1;
        for (int i = 0; i <numbers.length; i++) {

            first+=numbers[i][count];
            second+=numbers[i][count1];
            count++;
            count1--;


        }

        System.out.println(first);
        System.out.println(second);

    }
}
