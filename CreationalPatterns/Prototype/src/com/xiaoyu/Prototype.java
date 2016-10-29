package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/28.
 */
public abstract class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}
