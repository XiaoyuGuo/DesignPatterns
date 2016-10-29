package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public class ConcretePrototype2 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}
