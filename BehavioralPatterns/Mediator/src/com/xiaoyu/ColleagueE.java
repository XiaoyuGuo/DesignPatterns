package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class ColleagueE extends AbstractColleague2 {
    @Override
    public void setNumber(int number, AbstractMediator abstractMediator) {
        this.number = number;
        abstractMediator.eSync();
    }
}
