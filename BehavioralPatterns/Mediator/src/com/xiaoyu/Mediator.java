package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague2 c, AbstractColleague2 d, AbstractColleague2 e) {
        super(c, d, e);
    }
    // 1000 * c = 100 * d = 10 * e
    @Override
    public void cSync() {
        d.setNumber(c.getNumber() * 10);
        e.setNumber(c.getNumber() * 100);
    }

    @Override
    public void dSync() {
        c.setNumber(d.getNumber() / 10);
        e.setNumber(d.getNumber() * 10);
    }

    @Override
    public void eSync() {
        c.setNumber(e.getNumber() / 100);
        d.setNumber(e.getNumber() / 10);
    }
}
