package VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkVendingMachine extends VendingMachine {
    /**
     * HAS-A relation
     * DrinkVendingMachine HAS-A list of Drink objects
     */

    public List<Drink> drinks;

    /**
     * current will refer to currently selected drink
     */
    public Drink current;
    /**
     * after selecting the drink, whatever amount customer owes for the drink
     */
    public double amountLeftToPay;
    /**
     * after paying for the drink whatever amount is change
     */
    public double change;
    /**
     * used to check if drink is currently selected or no
     */
    public boolean isSelected;

    /**
     * public constructor.
     *
     * @param drinksParam VAR-ARGs.
     *                    Assign each Drink object into drinks list
     */
    public DrinkVendingMachine(Drink... drinksParam) {
        //TODO

        drinks = new ArrayList<Drink>();
        drinks.addAll(Arrays.asList(drinksParam));


    }

    /**
     * Override select abstract method.
     * This method will be used to select a drink in the vending machine
     *
     * @param itemNumber to select in Vending machine
     *                   options are 0 to drinks.size-1
     *                   1. if itemNumber is < 0 or more than drinks.size-1
     *                   then isSelected should be false
     *                   2. if a drink's quantity at that position is <=0
     *                   then isSelected should be false
     *                   3. Set the drink object at that index to current variable
     *                   4. Set the cost of the selected drink to amountLeftToPay variable
     *                   5. Set isSelected to true
     */

    //TODO: implement select method
    @Override
    public void select(int itemNumber) {

        if (itemNumber < 0 || itemNumber > drinks.size() - 1) {
            isSelected = false;
        } else if (drinks.get(itemNumber).getQuantity() <= 0) {
            isSelected = false;
        } else {
            current = drinks.get(itemNumber);
            amountLeftToPay = drinks.get(itemNumber).getCost();
            isSelected = true;

        }
    }


    /**
     * Override abstract method pay
     * Method is used to pay for the selected drink
     * <p>
     * 1. If isSelected is false then return 0.0
     * 2. Deduct money from amountLeftToPay
     * 3. if there is any change set the value to change variable (positive value)
     * 4. Decrease the quantity of the selected drink by 1
     * 5. Return amountLeftToPay value
     *
     * @param money
     */
    //TODO: implement pay menthod
    @Override
    public double pay(double money) {

        if (!isSelected) {
            return 0.0;
        } else {
            amountLeftToPay = amountLeftToPay - money;
            current.setQuantity(current.getQuantity() - 1);

            if (amountLeftToPay < 0) {
                change = money + amountLeftToPay;
                return 0.0;

            }
        }
        return amountLeftToPay;
    }


        /**
         * Override abstract method returnChange
         * Method is used to return the change to the customer
         * Return the value of change from the method and
         * 1. Set change to 0
         * 2. Set amountLeftToPay to 0
         *
         * @return
         */

        //TODO: implement returnChange method

        @Override
        public double returnChange () {
            double extra = change;
            amountLeftToPay = 0;
            change = 0;
            return extra;

        }


        /**
         * Override abstract method cancel
         * Method is used by customers to cancel any selected drinks
         * 1. set current drink to null
         * 2. amountLeftToPay is zero
         * 3. isSelected to false
         * 4. return any changes
         */

        //TODO: implement cancel method

         @Override
    public void cancel(){

             current = null;
             amountLeftToPay = 0;
             isSelected = false;
             returnChange();
         }


    }


