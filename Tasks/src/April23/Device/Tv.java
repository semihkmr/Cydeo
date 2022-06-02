package April23.Device;

public class Tv extends Device{

    public Tv(String brand, String model, double price, boolean isWireless){
        super(brand, model, price,isWireless);
    }

    @Override
    public String useDevice(){
        return "Using TV";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


