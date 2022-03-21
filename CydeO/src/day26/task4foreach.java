package day26;

public class task4foreach {
    public static void main(String[] args) {

        String [] str = {"apple","java","computer","water"};
        String small=str[0];
        String biggest=str[0];

        for(String word: str){
            if(word.length()> biggest.length()){
                biggest= word;
            }
            if(word.length()<small.length()){
                small = word;
            }
        }
    }
}
