package InterviewQuestions;

public class MiddleChar {

    public static String findMiddle(String str){

        String middle = "";
        if(str.length()%2 == 0){
            middle = str.substring(str.length()/2-1,str.length()/2+1);
        }
        else{
            middle = str.substring((str.length()-1)/2,(str.length()-1)/2+1);
        }
        return middle;
    }

    public static void main(String[] args) {

        System.out.println(findMiddle("java"));
        System.out.println(findMiddle("program"));
    }
}
