package InterviewQuestions;

public class JavaPython {
    
    public static Boolean countJavaAndPython(String sentence){

        int countJava = 0;
        int countPython = 0;
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length() ; i++) {
            if(sentence.contains("java")){
                countJava++;
            }
            if(sentence.contains("python")){
                countPython++;
            }
            sentence = sentence.replaceFirst("java","");
            sentence = sentence.replaceFirst("python","");
            
        }
        if(countJava == countPython){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(countJavaAndPython("java, javascript, python, c#, c++, rust, ruby python, swift"));
        System.out.println(countJavaAndPython("What's the difference between java, javascript and python?"));
    }

}
