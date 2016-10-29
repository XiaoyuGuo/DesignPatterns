package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public final class Singleton {
    private static Singleton instance = null;
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public void show(){
        System.out.println("Singleton");
    }
}
