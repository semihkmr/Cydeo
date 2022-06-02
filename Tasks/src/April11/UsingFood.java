package April11;

public class UsingFood {

    public static void main(String[] args) {
        Food food1 = new Food("Kebap");

        Food food2 = new Food("armut",5);

        Food food3 = new Food("Elma",4,1.99);

        Food food4 = new Food("ayva",7,2.99);

        Food food6 = new Food("ayv",10,2.99);


        Food food5[] = { food1, food2, food3,food4,food6};

        for (int i = 0; i < food5.length ; i++) {

            if(food5[i].name.startsWith("a")){
                if(food5[i].totalPrice> 20) {
                    System.out.println(food5[i]);



                }
            }

        }
    }



}
