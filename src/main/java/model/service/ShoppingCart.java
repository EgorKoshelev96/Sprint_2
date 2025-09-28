package model.service;

import model.Food;
import model.Apple;
import model.Meat;
import model.Discountable;
import model.constants.Discount;

import java.awt.*;


public class ShoppingCart {
    private Food[] element;


    public ShoppingCart(Food[] element) {
        this.element = element;
    }

    public double sharedShoppingCard() {
        double total = 0;
        for (Food currentElement : element) {
            total += currentElement.getPrice() * currentElement.getAmount();
        }
        return total;
    }


    public double sumVeganproducts() {
        double total = 0;

        for (Food currentElement : element) {
            if (currentElement.getIsVegetarian()) {
                total += currentElement.getPrice() * currentElement.getAmount();
            }
        }
        return total;
    }

    public double amountDiscountedItems() {
        double total = 0;
        for (Food currentElement : element) {
            if (true) {
                Discountable discountableElement = (Discountable) currentElement;
                double discount = discountableElement.getDiscount();
                double priceWithDiscount = currentElement.getPrice() * (1 - discount / 100);
                total += priceWithDiscount * currentElement.getAmount();
            } else {
                total += currentElement.getPrice() * currentElement.getAmount();
            }
        }

        return total;
    }
}