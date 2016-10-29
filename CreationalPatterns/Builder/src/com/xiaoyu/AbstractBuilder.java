package com.xiaoyu;

/**
 * Created by gxytk on 2016/9/27.
 * An abstract class for product both need step1 then step2 then step3
 */
public abstract class AbstractBuilder {
    public Product product = new Product();

    public abstract void executeStep1();
    public abstract void executeStep2();
    public abstract void executeStep3();
    public abstract boolean isProductProduced();

    public Product getProduct(){
        return product;
    }
}
