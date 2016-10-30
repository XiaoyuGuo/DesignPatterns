package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class PresidentPPower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE*60;
    }

    @Override
    protected String getRole() {
        return "President";
    }
}
