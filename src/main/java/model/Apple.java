package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // яблоки вегетарианские
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.red.equals(colour)) {
            return Discount.discount;
        } else {
            return Discount.noDiscount;
        }
    }
}
