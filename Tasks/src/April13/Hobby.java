package April13;

public class Hobby {

    String name;
    double annualCost;
    boolean isOutDoor;
    boolean requireOthers;

    public Hobby(String name){

        this.name = name;

    }
    public Hobby(String name, double annualCost){

        this(name);
        this.annualCost = annualCost;
    }
    public Hobby(String name, double annualCost, boolean isOutDoor, boolean requireOthers){

        this(name,annualCost);

        this.isOutDoor = isOutDoor;
        this.requireOthers = requireOthers;
    }
    public void doIt(){

        System.out.println("Doing "+ name + "- of the hobby " + " is outside " + isOutDoor  );
    }

    @Override
    public String toString() {

        String info = "My hobby is " + name ;

        info += " - " + ( annualCost > 0 ? ("This hobby cost me " + annualCost + " everytime"): " It is free");

        info += " - " + (isOutDoor ? (" We can only do this outside"): " Place no matter" );

        info += " - " + (requireOthers? "You can not do it alone :( You need a friends " : " Do it by yourself");

        return info +"\n";

    }
}
