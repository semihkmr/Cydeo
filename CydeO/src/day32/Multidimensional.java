package day32;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] numbers = {{3,5,1},{1,6,10},{5,21,10}};

        int totalDioagnal1 ;
        int totalDioagnal2;

        for( int [] eachArray:numbers){
            for( int each : eachArray ) {
                totalDioagnal1= each;
            }
        }



    }
}
