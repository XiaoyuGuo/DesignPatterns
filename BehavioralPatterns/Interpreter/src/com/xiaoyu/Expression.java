package com.xiaoyu;

import java.util.Map;

/**
 * Created by gxytk on 2016/10/31.
 */
public interface Expression {
    int interpret(Map<String, Expression> variables);
}
