package May9AustinTask.Task1;

public class Dog extends Animal{

    public String breed;
    public int humanYears;

    public Dog(String name, int age, String breed){
        super(name, age);

    }

    @Override
    public int getAgeInHumanYears() {
        if (getAge() <= 2) {
            humanYears = getAge() * 11;
        } else {

            humanYears = 22 + ((getAge() - 2) * 5);
        }
        return humanYears;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "Breed: " + breed + "Age in calendar years: " + getAge() + "Age in humanYears years:" +
                 humanYears;  }

    
    public boolean equals(Dog dog) {
        if(this.getAge() == dog.getAge() && this.breed.equalsIgnoreCase(dog.breed) && this.getName().equalsIgnoreCase(dog.getName())){
            return true;
        }
        else{
            return false;
        }
    }
}


