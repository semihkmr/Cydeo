package day23for;
import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shoppingList="Shopping List:\n";
       int shopping=0;
       String addMore;
       do {
           System.out.println("Please enter the item you need ");
           String itemToBuy = sc.nextLine();
           System.out.println("Would you like to add more item");
           addMore = sc.nextLine();
           if (shoppingList.contains(itemToBuy)) {
               System.out.println("You added this item aldready" + shoppingList);
           } else {
               shoppingList += itemToBuy+" ";
               System.out.println("New " + shoppingList);
           }
           shopping++;
       }
       while(addMore.equalsIgnoreCase("yes"));
       }
    }

