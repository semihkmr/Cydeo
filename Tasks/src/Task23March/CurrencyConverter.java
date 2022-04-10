package Task23March;

public class CurrencyConverter {
    public static String currencyConverter(String currencyType,double amount ){

        double euro = 1/0.91 * amount;
        double yen = 1/121.03*amount;
        double lira = 1/14.85*amount;
        double won = 1/1217.52*amount;
        double rupee  = 1/181.45*amount;

        switch (currencyType){
            case "euro":
                return euro+" euro";
            case "yen":
                return yen + " yen";
            case "lira":
                return lira + " lira";
            case "won":
                return won + " won";
            case "rupee":
                return rupee+ " rupee";
            default:
                return "Invalid";

        }
    }

    public static void main(String[] args) {
        System.out.println(currencyConverter("euro",50));
    }
}
