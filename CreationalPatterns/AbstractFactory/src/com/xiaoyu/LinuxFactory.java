package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public class LinuxFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new LinuxProduct();
    }
}
