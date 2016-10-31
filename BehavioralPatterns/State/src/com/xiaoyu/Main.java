package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 状态模式
 * StateContext保存着下一次的状态
 */
public class Main {
    public static void main(String[] args) {
        final StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
