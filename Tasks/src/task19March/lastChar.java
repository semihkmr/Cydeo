package task19March;

public class lastChar {
    public static void main(String[] args) {

       String [][] words ={{"James", "is", "back"}, {"he", "was", "never", "gone"}, {"methods", "tomorrow"}};
       String first="";
       String second="";
       String third= "";
           for(String[] eachArray : words){

               for(String  eachWord:eachArray ){
                   System.out.print(eachWord.charAt(eachWord.length()-1));
               }
               System.out.println();

           }

    }
}
