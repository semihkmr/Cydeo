package day19;

public class MergeStrings {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "def";

       String strmerge=str+str1;
        System.out.println(""+str.charAt(0)+str1.charAt(0)+str.charAt(1)+str1.charAt(1)+str.charAt(2)+str1.charAt(2));

//        String merged = "";
  //      merged += str.charAt(0);
    //    merged += str1.charAt(0);   This is the other method we can use while we are merging two different String

        str += str1;
        System.out.println(str);


        // substring() ---> There are two ways to use this method. Returns part of the String . Return String!


        // first one (int)    the return Strings start from the given ondex number until the end of the String
        // String  s="abc";
        // s.substring(1) ---> starts at b and goes until the end which is c --> output will be bc


        // second one (int,int) ---> the returned String starts from the given index number until the second given index, but the last index is not included in the characters

        // String



    }
}
