package main;

import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100);

        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApples, greenApples};

        ShoppingCart shoppingcart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: %.2f рублей %n",shoppingcart.sharedShoppingCard());
        System.out.printf("Общая сумма товаров со скидкой: %.2f рублей %n",shoppingcart.amountDiscountedItems());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f рублей %n",shoppingcart.sumVeganproducts());
    }
}


