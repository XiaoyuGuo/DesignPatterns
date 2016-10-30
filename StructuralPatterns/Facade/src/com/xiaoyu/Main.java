package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 * 门面模式
 * 通过ComputerFacade将实现指定功能的有关其他类的复杂操作封装
 * 对外提供简单的接口
 */
public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
