package April30;

public class Task3 {

    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"  Hel-lo -> Hlo
stringBits("Hi") → "H"            -> H
stringBits("Heeololeo") → "Hello" -> He e o lo leo
     */
    public String stringBits(String str) {



        String temp = "";


        for (int i = 0; i < str.length() ; i = i + 2) {
            temp += str.charAt(i);

        }

        return temp;


}}
