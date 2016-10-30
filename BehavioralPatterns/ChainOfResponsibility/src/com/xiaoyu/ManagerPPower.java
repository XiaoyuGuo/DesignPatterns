package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class ManagerPPower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE*10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }
}
