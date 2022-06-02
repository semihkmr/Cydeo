package April23.Season;

public class Season {

    String name;
    double highestAveTemp;
    double lowestAveTemp;

    public Season(String name, double highestAveTemp, double lowestAveTemp){
        this.name = name;
        this.highestAveTemp = highestAveTemp;
        this.lowestAveTemp = lowestAveTemp;
    }
    public String activity(){
  return "";
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAveTemp=" + highestAveTemp +
                ", lowestAveTemp=" + lowestAveTemp +
                '}';
    }
}
