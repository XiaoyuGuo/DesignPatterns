package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Wheel implements CarElement {

    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(CarElementVisitor carElementVisitor) {
        carElementVisitor.visit(this);
    }
}
