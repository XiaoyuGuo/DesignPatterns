package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/29.
 */
public class CircleShape extends Shape {

    private double x, y, radius;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x; this.y = y; this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
        radius *= (1.0 + pct/100.0);
    }
}
