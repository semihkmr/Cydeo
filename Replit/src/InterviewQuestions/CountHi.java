package InterviewQuestions;

public class CountHi {

    public static int countHi(String str){
        int countHi = 0;
        str = str.toLowerCase();
        for (int i = 0; i <str.length() ; i++) {
            if(str.contains("hi")){
                countHi++;
            }
            str = str.replaceFirst("hi","");
        }
        return countHi;
    }

    public static void main(String[] args) {

        System.out.println(countHi("hihihih"));
        System.out.println(countHi("hi1hdd1hi"));
    }
}
