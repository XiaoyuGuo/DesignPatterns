package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 * 工厂方法模式
 * 创建一个抽象的Creator，具体创建某个Product由子类来决定
 * 如ConcreteCreatorA继承Creator，决定创建ConcreteProductA
 * 如果想增加一个ConcreteCreatorC，直接继承实现方法返回ConcreteProductC即可
 * 这也是其优势，不必修改Creator
 */
public class FactoryMethod {
    public static void main(String[] args){

        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        Product productA = creatorA.createProduct();
        Product productB = creatorB.createProduct();

        System.out.println(productA.productName);
        System.out.println(productB.productName);
    }
}
