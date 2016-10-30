package com.xiaoyu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gxytk on 2016/10/31.
 * 解释器模式
 * 指定如何运行一个语言中的句子
 */
public class Main {
    public static void main(String[] args) {
        String expression = "w x z - +";
        //sentence为生成的语法树
        //以下面为例，该语法树为
        //Plus(Minus(Variable(w), Variable(x)), Variable(z))
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));

        //解释语法树，variables为参照列表，值的类型为Number
        //第一步，分别解释Minus(Variable(w), Variable(x))和Variable(z), 然后前者减去后者
        //第二步:
        //左侧分别解释Variable(w)和Variable(x),然后将结果相加
        //右侧获取Number(z)并解释Number(z),返回z对应的值，42
        //第三步:
        //Number(w)和Number(x)解释为5和10，相加为15
        //第四部:
        //15 - 42 = -27
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
