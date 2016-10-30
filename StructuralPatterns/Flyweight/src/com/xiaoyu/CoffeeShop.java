package com.xiaoyu;

import java.util.List;
import java.util.Vector;

/**
 * Created by gxytk on 2016/10/30.
 */
public class CoffeeShop {
    private final List<Order> orders = new Vector<>();
    private final Menu menu = new Menu();

    public void takeOrder(String flavourName, int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    public void service() {
        for(Order order : orders) {
            order.serve();
        }
    }

    public String report() {
        return "\ntotal CoffeeFlavour objects made: " + menu.totalCoffeeFlavoursMade();
    }
}
