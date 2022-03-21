package day33;

public class recap {
    public static void main(String[] args) {

        /*
        Recap

    1D Single Dimensional Arrays

        int [] nums = {1, 2, 5}
        String [] words = {"a", "b", "c"}


    2D Array

        array inside of an array - the elements were arrays

        int [][] n = { {2, 3, 5, 6}, {1, 5, 123, 51} };

        n[0] --> {2, 3, 5, 6}
        n[1] --> {1, 5, 123, 51}

        n[0][0] --> 2
        n[0][1] --> 3
        n[0][2] --> 5
        n[0][3] --> 6

        n.length --> 2

        n[0].length --> 4

    loop through 2d array

    for each

        for(int [] arr : n){
            // this loop goes through the 2d array. The elements are arrays

            for(int number : arr){
                // this loop goes through each inner array, which will see each number

            }

        }

    traditional

        for(int i = 0; i < n.length; i++){
            // this loop goes through the 2d array. The elements are arrays
            // to access each array element --> n[i]

            for(int j = 0; j < n[i].length; j++ ){

                // this loop goes through each inner array, which will see each number
                // to access every inner element --> n[i][j]

            }
        }

declaring 2D array

    datatType [][] arrayName = new dataType[x][z];

        where x is how many elements the 2D array has - number of arrays

        where z is the size of each inner array
            -> is optional to define. If it is not defined then the inner arrays sizes do not matter, they can be different

    datatType [][] arrayName = { arrayName1, arrayName2, etc}

    dataType [][] arrayName = { {element, element, element, etc}, {element, element, element, etc}, {element, element, element, etc} };

         */
    }
}
