package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class StateLowerCase implements StateLike {
    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toLowerCase());
        context.setMyState(new StateMultipleUpperCase());
    }
}
