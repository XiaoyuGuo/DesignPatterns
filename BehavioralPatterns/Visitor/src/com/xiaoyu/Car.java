package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Car implements CarElement {
    CarElement[] elements;

    public Car() {
        this.elements = new CarElement[] {
                new Wheel("fl"),
                new Wheel("fr"),
                new Wheel("bl"),
                new Wheel("br"),
                new Body(),
                new Engine()
        };
    }

    @Override
    public void accept(CarElementVisitor carElementVisitor) {
        for(CarElement carElement : elements) {
            carElement.accept(carElementVisitor);
        }
    }
}
