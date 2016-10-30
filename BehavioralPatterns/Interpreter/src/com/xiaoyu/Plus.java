package com.xiaoyu;

import java.util.Map;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
