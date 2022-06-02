package Extra.encapsulation.Pizza;

public class Pizza {

    private String  size;
    private int numberOfToppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
       if(size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large") || size.equalsIgnoreCase("Small")){
           this.size = size;
       }


    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if(numberOfToppings > 0){

        this.numberOfToppings = numberOfToppings;
    }}

    public Pizza(String size, int numberOfToppings){
            setNumberOfToppings(numberOfToppings);
            setSize(size);
        }

        public double calculatePrice(){

            if(size == null){
                return -1;
            }

            double price = size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;

            return price + (numberOfToppings * 0.75);
        }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                '}';
    }
}

