package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/29.
 * 桥接模式
 * 使用对象组合的方式，拆解集成关系，使得两个类更加独立
 * 如本例中，Shape需要draw方法
 * Shape可以有多个具体子类， 如Circle
 * draw也可以有多种draw的方式，如DrawingAPI1和DrawingAPI2
 * 传统方法要在抽象Shape中设置所有draw的方法，通过继承实现
 * 这样的话无论是添加draw的方法还是删除draw的方法都会造成很大影响
 * 而桥接模式通过对象组合的方式，将具体draw和具体shape分开，
 * 同时，每个shape都可以接受不同的draw来调用不同的draw方法
 * 这样，无论是添加shape还是添加draw都不会改动原来的代码
 * 如本例中新添一个DrawingAPI3，只要实现DrawingAPI接口，可以
 * 直接将DrawingAPI3作为参数传入所有类型的shape中实现新的具体draw方法
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
          new CircleShape(1, 3, 5, new DrawingAPI1()),
          new CircleShape(2, 4, 6, new DrawingAPI2())
        };

        for (Shape shape: shapes) {
            shape.resizeByPercentage(100);
            shape.draw();
        }
    }
}
