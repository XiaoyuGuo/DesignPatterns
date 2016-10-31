package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class NormalStrategy implements BillStrategy {
    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice;
    }
}
