package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public interface CarElement {
    void accept(CarElementVisitor carElementVisitor);
}
