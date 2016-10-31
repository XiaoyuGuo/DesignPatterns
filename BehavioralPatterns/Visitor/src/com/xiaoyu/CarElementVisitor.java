package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
