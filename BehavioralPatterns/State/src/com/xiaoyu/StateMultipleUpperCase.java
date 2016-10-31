package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class StateMultipleUpperCase implements StateLike {
    private int count = 0;
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        if(++count > 1) {
            context.setMyState(new StateLowerCase());
        }
    }
}
