package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/29.
 */
public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("API2.circle at (" + x + ", " + y + ") radius " + radius);
    }
}
