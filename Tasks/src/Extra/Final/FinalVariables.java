package Extra.Final;

public class FinalVariables {

    public final String language;
    public final static double PI;

    public FinalVariables(String language){
        this.language = language;

    }

    static {
        PI = 3.14;
    }

}
