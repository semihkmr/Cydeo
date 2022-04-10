package day37;

public class CountCharacters {

    public static void main(String[] args) {
  int countUpper=0;
  int countLower=0;
  int countNumber=0;
  int countSymbol=0;
         String str = "aP3d572&*jd@jdJU";
        for (int i = 0; i < str.length() ; i++) {
            char letter = str.charAt(i);

            if (Character.isLowerCase(letter)) {
                countLower++;
            } else if (Character.isUpperCase(letter)) {
                countUpper++;
            } else if (Character.isDigit(letter)) {
                countNumber++;
            } else {
                countSymbol++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println(countNumber);
        System.out.println(countSymbol);
    }
}
