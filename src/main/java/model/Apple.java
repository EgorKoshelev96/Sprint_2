package model;

import model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price,true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour == "red"){
            return Discount.redDiscount;
        }
        return 0;
    }

}

