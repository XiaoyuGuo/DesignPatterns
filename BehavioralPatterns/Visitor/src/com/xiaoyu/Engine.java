package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Engine implements CarElement {
    @Override
    public void accept(CarElementVisitor carElementVisitor) {
        carElementVisitor.visit(this);
    }
}
