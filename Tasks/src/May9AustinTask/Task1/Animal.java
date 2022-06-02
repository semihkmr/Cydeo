package May9AustinTask.Task1;

public abstract class Animal {

   private String name;
   private int age;

   public abstract int getAgeInHumanYears();

   public Animal(String name, int age){
       this.name = getName();
       this.age = getAge();
   }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
