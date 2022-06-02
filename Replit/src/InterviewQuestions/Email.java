package InterviewQuestions;

import java.io.FilterOutputStream;

public class Email {

    /*
    Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
     */

    public static String email(String str){

         int  nameFinish =  str.indexOf("_");
         int lastNameFinish = str.indexOf("@");
         int domainFinish = str.indexOf(".");

         String name = str.substring(0,nameFinish);
         String lastName = str.substring(nameFinish+1,lastNameFinish);
         String domain = str.substring(lastNameFinish+1,domainFinish);


         return "First name: " + name + "\n" + "Last name: " +  lastName + "\n" + "Domain: " + domain;

    }

    public static void main(String[] args) {

        System.out.println(email("jeff_bezos@amazon.us"));
    }
}
