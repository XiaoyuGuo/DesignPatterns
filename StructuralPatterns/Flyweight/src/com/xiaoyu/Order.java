package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 */
public class Order {
    private final int tableNumber;
    private final CoffeeFlavour flavour;

    public Order(int tableNumber, CoffeeFlavour flavour) {
        this.tableNumber = tableNumber;
        this.flavour = flavour;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
