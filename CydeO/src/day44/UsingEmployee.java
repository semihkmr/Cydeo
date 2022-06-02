package day44;

public class UsingEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Semih","SDET");

        Employee empployee2 = new Employee("Ahmet",987,"SDET",150000);

        Employee employee3 = new Employee("Memet",986,"SDET",130000);

        Employee[] arr = {employee1,empployee2,employee3};

        for (int i = 0; i < arr.length ; i++) {

                if(arr[i].salary> 90000){
                    System.out.println(arr[i]);
                }
        }
    }





}
