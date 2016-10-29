package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 * 单例模式
 * 当系统仅仅需要一个实例的时候，单例模式是一个很好的选择
 * 节约系统开销，单例模式往往要比全局变量好
 */
public class Main {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.show();
    }
}
