package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public abstract class AbstractColleague1 {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractColleague1 coll);
}
