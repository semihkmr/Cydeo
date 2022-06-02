package April23.Season;

public class Spring extends Season{

    public Spring(double highestAveTemp, double lowestAveTemp){
        super("Spring", highestAveTemp, lowestAveTemp);
    }
    @Override
    public String activity(){
        return "Go Outside";
    }
}
