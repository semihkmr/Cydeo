package day20;

public class officehours {
    public static void main(String[] args) {
        String result = "About 649823402394803280,000,000 results (0.78 seconds)";
        int startIndex= result.indexOf(" ");
        int endIndex = result.indexOf(" ",startIndex+1);


        String searchResult = result.substring(startIndex+1,endIndex);
        System.out.println(searchResult);

        startIndex = result.indexOf("(");
        endIndex = result.indexOf(")");
        System.out.println(result.substring(startIndex+1,endIndex));
    }
}
