package day15;

import java.util.Scanner;





public class satis {



            public static void main(String[] args) {

                int priceScreen=0 , priceCpu=0 , priceRam = 0, priceStorage = 0, priceSize = 0, priceResolution = 0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Select screen size:");
                String screenSize = sc.nextLine();
                System.out.println("Select CPU type:");
                sc.next();
                String CPU = sc.nextLine();
                System.out.println("Select RAM size:");

                int ramsize = sc.nextInt();
                System.out.println("Select storage type:");
                sc.next();
                String storageType = sc.nextLine();
                System.out.println("Select storage size:");
                int storageSize = sc.nextInt();
                System.out.println("Select screen resolution:");

                String screenResolution = sc.next();
                switch (screenSize) {
                    case "13.3":
                        priceScreen = 200;

                    case "15.0":
                        priceScreen = 300;

                    case "17.3":
                        priceScreen = 400;



                }

                switch (CPU) {
                    case "i3":
                        priceCpu = 150;

                    case "i5":
                        priceCpu = 250;

                    case "i7":

                        priceCpu = 350;


                }

                switch (ramsize) {
                    case 4:
                        priceRam = 50;

                    case 8:
                        priceRam = 100;

                    case 12:
                        priceRam = 150;

                    case 16:
                        priceRam = 200;


                }


                switch (storageType) {
                    case "HDD":

                        if(storageSize==500){
                           priceStorage = 50;
                        }
                        if(storageSize==1000){
                            priceStorage=100;
                        }





                }

                switch(storageType){
                    case "SSD":
                        if(storageSize==500){
                            priceStorage=100;
                        }
                        if(storageSize==1000){
                            priceStorage=200;
                        }




                }

                switch (screenResolution) {
                    case "FULLHD":
                        priceResolution = 100;

                    case "4K":
                        priceResolution = 200;



                }

                System.out.println( priceScreen+priceCpu+priceRam+priceStorage+priceSize+priceResolution);

            }

    }




