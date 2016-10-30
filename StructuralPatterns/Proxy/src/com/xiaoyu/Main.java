package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 代理模式
 * 使用代理模式可以添加额外的逻辑，同时可以添加额外的逻辑，隔离真实对象。
 * 与装饰器模式不同的是，装饰器模式的意义在于运行时操作原始的类进行装饰，
 * 换句话说，就是装饰器模式需要原始对象作为参数，本身代码逻辑是分开的，
 * 甚至可以不断的添加其他种类的装饰，而代理模式是内部直接创建，并和外界隔离
 */
public class Main {
    public static void main(String[] args) {
        final Image IMAGE1 = new ProxyImage("IMAGE1");
        final Image IMAGE2 = new ProxyImage("IMAGE2");

        IMAGE1.displayImage();
        IMAGE1.displayImage();
        IMAGE2.displayImage();
        IMAGE2.displayImage();
        IMAGE1.displayImage();
    }
}
