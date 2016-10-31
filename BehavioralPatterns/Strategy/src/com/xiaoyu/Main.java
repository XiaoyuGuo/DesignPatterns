package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 策略模式
 * 策略模式将不同的算法封装到具有共同接口的独立的类中
 * 他们可以互相替换
 */
public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(new NormalStrategy());

        firstCustomer.add(2.0, 1);

        firstCustomer.setStrategy(new HappyHourStrategy());

        firstCustomer.add(2.0, 2);

        firstCustomer.printBill();
    }
}
