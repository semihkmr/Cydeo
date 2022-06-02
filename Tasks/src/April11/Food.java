package April11;

public class Food {

         String name;
         int guantity;
         double unitPrice;
         double totalPrice;

         public Food(String name){

             this.name = name;
         }

         public Food(String name, int guantity){

             this(name);
             this.guantity = guantity;
         }
         public Food(String name, int guantity, double unitPrice){

             this(name, guantity);
             this.unitPrice = unitPrice;
              calculatePrice();
         }

         public void  calculatePrice(){

             totalPrice = guantity * unitPrice;

         }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", guantity=" + guantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';

    }

}
