package com.xiaoyu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gxytk on 2016/10/31.
 * 备忘录模式
 * 保存类状态，这里以字符串为状态
 */
public class Main {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
        savedStates.add(originator.saveToMemento());
        originator.set("State4");

        originator.restoreFromMemento(savedStates.get(1));
    }
}
