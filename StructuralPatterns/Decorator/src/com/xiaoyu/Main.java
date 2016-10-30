package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 * 装饰器模式
 * 装饰器模式能够动态的为一个对象添加功能
 * 使用了对象组合避免了派生子类和修改原有类
 * 本质是动态组合
 * 本例中SimpleWindow实现了Window接口，具体的类
 * 抽象Window装饰器WindowDecorator实现了Window接口
 * 由WindowDecorator派生出来的子装饰器都能够很好的应用于SimpleWindow
 */
public class Main {
    public static void main(String[] args) {

        Window window = new SimpleWindow();

        //加一个垂直滚动条，使用装饰器装饰
        Window decoratedWindow1 = new VerticalScrollBarDecorator(window);
        System.out.println(decoratedWindow1.getDescription());

        //再加一个水平滚动条，使用装饰器装饰已被装饰的window
        Window decoratedWindow2 = new HorizontalScrollBarDecorator(decoratedWindow1);
        System.out.println(decoratedWindow2.getDescription());

    }
}
