package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/29.
 */
public class DrawingAPI1 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("API1.circle at (" + x + ", " + y + ") radius " + radius);
    }
}
