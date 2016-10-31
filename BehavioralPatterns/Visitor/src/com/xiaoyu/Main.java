package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 访问者模式
 * CarElementPrintVisitor实现了抽象车辆元素观光者的接口，
 * 实现了具体的对于每一个车辆元素的观光方法
 * 在这里的观光方法主要是print
 * 可以实现具体算法与元素的剥离
 * 适用于稳定的数据结构和易变的操作
 */
public class Main {
    public static void main(String[] args) {
        CarElementVisitor carElementPrintVisitor = new CarElementPrintVisitor();
        CarElement car = new Car();
        car.accept(carElementPrintVisitor);
    }
}
