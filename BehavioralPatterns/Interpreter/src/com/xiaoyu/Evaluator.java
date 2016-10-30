package com.xiaoyu;

import java.util.Map;
import java.util.Stack;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<>();
        //token为表达式中的每一个字符
        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                //遇到加号，则弹出两个操作数执行加法，将结果入栈
                Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                //遇到剑法，则弹出两个操作数执行剑法，将结果入栈
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            } else {
                //在遇到符号之前把所有的操作数压入栈
                expressionStack.push(new Variable(token));
            }
        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}
