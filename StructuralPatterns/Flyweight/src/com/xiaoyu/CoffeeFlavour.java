package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 */
public class CoffeeFlavour {
    private final String name;

    CoffeeFlavour(String newFlavour) {
        this.name = newFlavour;
    }

    @Override
    public String toString() {
        return name;
    }
}
