package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class ColleagueA extends AbstractColleague1 {
    @Override
    public void setNumber(int number, AbstractColleague1 coll) {
        this.number = number;
        coll.setNumber(number*100);
    }
}
