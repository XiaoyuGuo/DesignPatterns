package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 * 抽象工厂模式
 * 抽象模式关注产品族
 * 在AbstractFactory中定义了一套产品，如操作系统的组件
 * 通过继承AbstractFactory，实现了Win和Linux两个产品族的具体工厂
 * 根据产品族的具体工厂，可以生产该产品族的各个组件
 */
public class AbstractFactoryPattern {
    public static void main(String[] args){

        AbstractFactory winFactory = new WinFactory();
        AbstractFactory linuxFactory = new LinuxFactory();

        AbstractProduct winProduct = winFactory.createProduct();
        AbstractProduct linuxProduct = linuxFactory.createProduct();

        winProduct.depict();
        linuxProduct.depict();
    }
}
