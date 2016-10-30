package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class VicePresidentPPower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE*40;
    }

    @Override
    protected String getRole() {
        return "VicePresidentPPower";
    }
}
