package day26;

public class task3 {
    public static void main(String[] args) {
        String [] name = {"james Bond","Eve Ball", "Anna Johnson"};
        String [] new1;

        for (int i = 0; i <name.length ; i++) {
            String fullName= name[i];
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();
            // indexOf(" ")+1;

            System.out.print(""+fullName.charAt(0)+lastName.charAt(0));




        }


    }

}
