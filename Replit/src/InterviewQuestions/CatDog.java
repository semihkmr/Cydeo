package InterviewQuestions;

public class CatDog {

    public static boolean countDogAndCat(String str){

        int countDog = 0;
        int countCat = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.contains("cat")){
                countCat++;
            }
            if(str.contains("dog")){
                countDog++;
            }
            str = str.replaceFirst("cat","");
            str = str.replaceFirst("dog","");
        }
        if(countCat == countDog){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(countDogAndCat("catdogdog"));
        System.out.println(countDogAndCat("cat1dog23catdog"));
    }

}
