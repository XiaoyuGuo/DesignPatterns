package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 * 抽象享元模式
 * 某个桌子需要的不同种类咖啡，假设其为对象，
 * 则其拥有两种行为：
 * 1.外部行为
 * 受环境影响的，比如桌子的序号，随着客人的变化是不一定的
 * 2.内部行为
 * 不受环境影响的，比如咖啡就是固定的集中口味，大量重复
 * 所以，我们应该将外部行为独立，同时将同种类的咖啡的对象共享
 * 所有客人点的某种咖啡都将指到特定的一个对象上，节约系统开销
 * 因此，对于咖啡的属性，也应该设置为只读
 */
public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Frappe", 897);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Frappe", 552);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);

        shop.service();
        System.out.println(shop.report());
    }
}
