package day42;

public class Coffee {

    /*
    Create a coffee class with these instance variable :
     brand , price , size(oz) , type

      - make a toString to print all  the information of the coffee

      - drink : print trying type of coffee
      -  refill(amount in oz) : print refilling X oz
       add the number of oz to the total size
     */

    String brand;
    double price;
    double size ;
    String type;

    public void drink()
    {
        System.out.println("type of coffee is: " + type);
    }

    public void refill(double amount){
        System.out.println("refilling: " + amount+ " oz of coffee" );

        size += amount;

    }

    @Override
    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
