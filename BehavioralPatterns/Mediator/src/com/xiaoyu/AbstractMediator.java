package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public abstract class AbstractMediator {
    protected AbstractColleague2 c;
    protected AbstractColleague2 d;
    protected AbstractColleague2 e;

    public AbstractMediator(AbstractColleague2 c, AbstractColleague2 d, AbstractColleague2 e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public abstract void cSync();
    public abstract void dSync();
    public abstract void eSync();
}
