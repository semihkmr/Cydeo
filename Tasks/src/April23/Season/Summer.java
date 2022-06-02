package April23.Season;

public class Summer extends Season {

    public Summer(double highestAveTemp, double lowestAveTemp){
        super("Summer", highestAveTemp, lowestAveTemp);
    }

    @Override
    public String activity(){
        return "Drink Lemonade";
    }

}
