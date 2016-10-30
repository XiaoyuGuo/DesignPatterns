package com.xiaoyu;

import java.util.Map;

/**
 * Created by gxytk on 2016/10/31.
 * 将数字解释为数字
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
