package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct(){
        return new ConcreteProductA();
    }
}
