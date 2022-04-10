package Task23March;

public class CamelCase {
    public static String camelCase(String sentence){
        String [] arr = sentence.split(" ");
        String camelCase = "";
        for(String each:arr){

                camelCase+= each.substring(0,1).toUpperCase()+each.substring(1).toLowerCase();

        }
    camelCase = camelCase.substring(0,1).toLowerCase()+camelCase.substring(1);
    return  camelCase;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
    }
}
