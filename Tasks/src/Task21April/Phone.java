package Task21April;

public class Phone {

  private  String color;
  private  String model;

    public Phone(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
