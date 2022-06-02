package Task17April;

import java.util.Locale;

public class Pizza {

    private String size;
    private int numberOfTopics;

    public Pizza(String size, int numberOfTopics){
        setSize(size);
        setNumberOfTopics(numberOfTopics);

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch (size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
                this.size = size;
        }
    }
    public int getNumberOfTopics() {
        return numberOfTopics;
    }

    public void setNumberOfTopics(int numberOfTopics) {
        if(numberOfTopics>0){
        this.numberOfTopics = numberOfTopics;
    }}
    public double calculatePrice(){
         double cost = 0;
            switch (size.toLowerCase()){
                case "small":
                    cost += 4 + 0.75*numberOfTopics;
                    break;
                case "medium":
                    cost += 6 + 0.75*numberOfTopics;
                    break;
                case "large":
                    cost += 8 + 0.75*numberOfTopics;
                    break;
        }
    return cost;
    }

    @Override
    public String toString() {
        return "Your " + size + " pizza with " + numberOfTopics + " topics will cost $" + calculatePrice();
    }
}
