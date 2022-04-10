package Task23March;

public class helo {
    public static void main(String[] args) {
        System.out.println(currencyConverter("euro", 100));
        System.out.println(currencyConverter("yen", 50));
    }

    public static String currencyConverter(String currencyType, double currencyAmount) {
        switch (currencyType) {
            case "euro":
                return currencyAmount * 0.91 + " euro";
            case "yen":
                return currencyAmount * 121.03 + " yen";
            case "lira":
                return currencyAmount * 14.85 + " lira";
            case "won":
                return currencyAmount * 1217.52 + " won";
            case "rupee":
                return currencyAmount * 181.45 + " rupee";
            default:
                return "Invalid current";
        }
    }
}


