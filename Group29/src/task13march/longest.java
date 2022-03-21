package task13march;

public class longest {
    public static void main(String[] args) {
        String [] str = {"java","longer word", "civic" ,"apple", "racecar", "mom", "anna"};
        String check="";
        String reverse="";
        String palindrome="";
        String longest= str[0];
        for (int i = 0; i <str.length ; i++) {
           check = str[i];
            reverse="";
           for (int j = check.length()-1; j >=0  ; j--) {
                reverse += check.charAt(j);
                palindrome="";
                if(check.equalsIgnoreCase(reverse)){
                    palindrome=check;
                    if(palindrome.length()>longest.length()){
                        longest=palindrome;
                    }
                }

            }
        }
        System.out.println(longest);


    }
}
