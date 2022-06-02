package May10;

public class Input implements WebElement {
    @Override
    public void click() {
        System.out.println("Clicking Input");

    }

    @Override
    public String getText() {
        return "Input Text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Sending txt to Input field");
        System.out.println(txt);
    }
}
