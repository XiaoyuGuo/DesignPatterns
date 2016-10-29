package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 * 抽象工厂模式
 * 一般用于不同产品族的生产
 */
interface AbstractFactory {
    public AbstractProduct createProduct();
}
