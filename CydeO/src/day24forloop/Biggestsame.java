package day24forloop;

public class Biggestsame {
    public static void main(String[] args) {


        String s = "aabbbcccc";
        String sub = ""; //
        String biggest = ""; // ccccc
        int endIndex=s.length();
         s+=" ";
        for(int i = 0; i < endIndex; i++){

            sub += s.charAt(i);

            if(s.charAt(i) != s.charAt(i + 1)){  // when the character of i is different from the character next to it (i + 1)

                if(sub.length() > biggest.length()){
                    biggest = sub; // assigns the substring as the new biggest
                }
                sub = ""; // resets this String for the next substring
            }

        }

        System.out.println(biggest);


    }

}

