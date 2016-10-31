package com.xiaoyu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Customer {
    private List<Double> drinks;
    private BillStrategy strategy;

    public Customer(BillStrategy strategy) {
        this.drinks = new ArrayList<>();
        this.strategy = strategy;
    }

    public void add(double price, int quantity) {
        drinks.add(strategy.getActPrice(price * quantity));
    }

    public void printBill() {
        double sum = 0;
        for (Double i : drinks) {
            sum += i;
        }
        System.out.println("Total due: " + sum);
        drinks.clear();
    }

    public void setStrategy(BillStrategy strategy) {
        this.strategy = strategy;
    }
}
