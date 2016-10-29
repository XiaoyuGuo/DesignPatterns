package com.xiaoyu.ClassAdapter;

/**
 * Created by gxytk on 2016/10/28.
 * 适配器模式（类）
 * 我想通过IphoneInterface接口定义的模式调用Android的方法
 * 因此要将Android接口与IphoneInterface适配
 * 所谓使用AndroidAdapter继承Android同时实现IphoneInterface
 * 使得Android的相应方法以IphoneInterface的形式被调用
 */
public class Main {
    public static void main(String[] args) {

        //使用自己的接口
        IphoneInterface iphoneInterface = new Iphone();
        iphoneInterface.getIphoneInfo();

        //使用适配器，调用被适配的接口
        IphoneInterface androidAdapter = new AndroidAdapter();
        androidAdapter.getIphoneInfo();
    }
}
