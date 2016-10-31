package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 模板方法模式
 * 主要是制定一个模板
 */
public class Main {
    public static void main(String[] args) {
        ChessGame cg = new ChessGame();
        cg.initializeGame();
        cg.makePlay(1);
        cg.endOfGame();
        cg.printWinner();
    }
}
