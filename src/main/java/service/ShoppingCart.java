package service;
import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getFullPrice() {
        double fullPrice = 0;
        for (Food item : items) {
            fullPrice += item.getAmount() * item.getPrice();
        }
        return fullPrice;
    }

    public double getFullPriceWithDiscount() {
        double fullPriceWithDiscount = 0;
        for (Food item : items) {
            fullPriceWithDiscount += item.getAmount() * item.getPrice() * (1 - (item.getDiscount() / 100));
        }
        return fullPriceWithDiscount;
    }


    public double getFullPriceVeganWithoutDiscount() {
        double FullPriceVeganWithoutDiscount = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                FullPriceVeganWithoutDiscount += item.getAmount() * item.getPrice();
            }
        }
        return FullPriceVeganWithoutDiscount;
    }


}
