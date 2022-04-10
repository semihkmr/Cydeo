package Task27March;

public class validPassword {
    public static Boolean validPassword(String str){

        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOthers=0;
        for (int i = 0; i <str.length() ; i++) {
            char letter= str.charAt(i);
           if(str.contains("!")||str.contains("@")||str.contains("#")||str.contains("$")||str.contains("%")||str.contains("^")||str.contains("&")||str.contains("*")){
            if(Character.isLowerCase(letter)){
                countLower++;
            }
            else if(Character.isUpperCase(letter)){
                countUpper++;
            }
            else if(Character.isDigit(letter)){
                countNumber++;
            }
            else {
                countOthers++;
            }
        }}
        if(str.length()>=8&&countLower>=1&&countUpper>=1&&countNumber>=1){
            return true;

        }return false;
    }

    public static void main(String[] args) {
        System.out.println(validPassword("121af%qfqw"));
    }
}
