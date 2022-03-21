package day26;

public class task5 {
    public static void main(String[] args) {
        String [] items= {"Shoes","Jackets","Gloves","Airpod","Ipod","Bsckpack"};

        double[] prices = {89.99,150.0,999.99,250.0,439.5,39.99};
        int [] itemIds = {12345,12346,12347,12348,12349,12350};
        double  expensive=prices[0];
        int indexOfExpensive=0;
        for (int i = 0; i <items.length ; i++) {
            System.out.println("Item Id " + itemIds[i]+" are "+ items[i] + " and they cost $"+ prices[i]);

        }
        for (int i = 0; i < items.length ; i++) {

            if( items[i].equalsIgnoreCase("Gloves")){
                System.out.println(i);
            }

        }
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i]>expensive){
                expensive=prices[i];
                indexOfExpensive=i;
            }



        }
        System.out.println(expensive+" "+items[indexOfExpensive]+" "+itemIds[indexOfExpensive]);

    }
}
