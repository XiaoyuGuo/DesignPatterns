package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class DirectorPPower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE*20;
    }

    @Override
    protected String getRole() {
        return "Director";
    }
}
