package April23.Season;

public class Fall extends Season{

    public Fall(double highestAveTemp, double lowesAveTemp){
        super("Fall", highestAveTemp, lowesAveTemp);
    }

    @Override
    public String activity(){
        return "Read a book";
    }
}
