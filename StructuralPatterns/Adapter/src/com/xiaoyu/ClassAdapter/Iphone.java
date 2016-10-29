package com.xiaoyu.ClassAdapter;

/**
 * Created by gxytk on 2016/10/28.
 */
public class Iphone implements IphoneInterface {
    @Override
    public void getIphoneInfo() {
        System.out.println("这里是苹果系统的信息");
    }
}
