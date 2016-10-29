package com.xiaoyu.ObjectAdapter;

/**
 * Created by gxytk on 2016/10/28.
 * 适配器模式（对象）
 * 与类适配器模式不同的是
 * 对象适配器没有继承Android类，而是在内部实例化了Android类
 */
public class Main {
    public static void main(String[] args) {

        IphoneInterface iphone = new Iphone();
        iphone.getIphoneInfo();

        IphoneInterface android = new AndroidAdapter();
        android.getIphoneInfo();
    }
}
