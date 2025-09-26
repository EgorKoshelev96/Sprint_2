package main;

import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100);

        Food redApples = new Apple(10, 50, Colour.red);
        Food greenApples = new Apple(8, 60, Colour.green);

        Food[] products = {meat, redApples, greenApples};

        ShoppingCart shoppingcart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки:" + shoppingcart.sharedShoppingCard() + "рублей");
        System.out.println("Общая сумма товаров со скидкой:" + shoppingcart.amountDiscountedItems() + "рублей");
        System.out.println("Сумма вегетарианских продуктов без скидки:" + shoppingcart.sumVeganproducts() + "рублей");
    }
}


