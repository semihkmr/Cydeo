package day14;
import java.util.Scanner;
public class pandemic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enterr the year");
        int year = sc.nextInt();

        if (year<=1353&&year>=1346){
            System.out.println("The Black Dearth");
        }
        else if(year<=1665&&year>=1666){
            System.out.println("Great Plague of London");
        }
        else if(year<=1770&&year>1772){
            System.out.println("Russian plague");
        }
        else if(year>=1889&&year<=1890){
            System.out.println("flu pandemic");
        }
        else if(year==1916){
            System.out.println("American polio epidemic");
        }
        else if(year>=1918&&year<=1920){
            System.out.println("Spanish flu");
        }
        else if(year>=2009&&year<=2010){
            System.out.println("H1N1");
        }
        else if(year>=2014&&year<=2016){
            System.out.println("West African");
        }
        else if(year>=2020&&year<=2022){
            System.out.println("COVID 19");
        }
        else{
            System.out.println("Any year not in those range: No pandemic");
        }
    }

}
