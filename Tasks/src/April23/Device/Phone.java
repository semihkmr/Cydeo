package April23.Device;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean isWireless){
        super(brand, model, price, isWireless);
    }
    @Override
    public String useDevice(){
        return "Using Phone";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
