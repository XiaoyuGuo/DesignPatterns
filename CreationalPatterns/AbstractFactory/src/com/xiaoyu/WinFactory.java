package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public class WinFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new WinProduct();
    }
}
