package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class StateContext {
    private StateLike myState;
    public StateContext() {
        setMyState(new StateLowerCase());
    }

    void setMyState(final StateLike newState) {
        myState = newState;
    }

    public void writeName(final String name) {
        myState.writeName(this, name);
    }
}
