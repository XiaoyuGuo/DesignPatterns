package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 * 原型模式
 * 原型模式通过复制一个已有的原型，使得程序性能提高
 * 如ConcretePrototype1需要被重复使用的时候
 * 使用原型模式就是一个很好的选择
 * 具体原型的制定需要继承Prototype
 */
public class Main {
    public static void main(String[] args){
        ConcretePrototype1 prototype = new ConcretePrototype1();
        try {
            for(int i = 0; i < 10; i++) {
                ConcretePrototype1 concretePrototype1 = (ConcretePrototype1) prototype.clone();
                concretePrototype1.show();
            }
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
