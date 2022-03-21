package day32;

import java.util.Arrays;
import java.util.Scanner;

public class flow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapter is there");
        String [][] books = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(books));
        input.nextLine();

        for (int i =0; i < books.length; i++){
            System.out.println("Enter Chapter " + (i + 1));
            String chapter = input.nextLine();
            String [] sentences = chapter.split("\\.");
            books[i] = sentences;
        }
    }

}
