package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public class ConcretePrototype1 extends Prototype {
    public void show(){
        System.out.println("ConcretePrototype1");
    }
    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
