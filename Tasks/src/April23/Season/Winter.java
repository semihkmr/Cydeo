package April23.Season;

public class Winter extends Season{

    public Winter(double highestAveTemp, double lowestAveTemp){
        super("Winter", highestAveTemp, lowestAveTemp);

    }

    @Override
    public String activity(){
        return "Use fireplace";
    }

}
