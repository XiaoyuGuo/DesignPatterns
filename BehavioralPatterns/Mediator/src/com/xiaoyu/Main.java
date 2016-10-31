package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 中介者模式
 * 中介者模式将相关联的类中的复杂关系剥离出来，以中介者统一提供接口
 * 同时，关系的处理规则也在中介者中就能改动
 *
 * 如AbstractColleague2，接受中介者作为参数，使用中介者的接口应用自己对其他所有类的影响
 * AbstractMediator指定了抽象中介者，处理C,D,E之间的关系
 * Mediator继承了AbstractMediator，实现了具体的关系处理方式
 */
public class Main {
    public static void main(String[] args) {
        //collA和collB相互影响，collB永远是collA的100倍
        AbstractColleague1 collA = new ColleagueA();
        AbstractColleague1 collB = new ColleagueB();

        //A影响B
        collA.setNumber(1000, collB);
        System.out.println("collA: " + collA.getNumber());
        System.out.println("collB: " + collB.getNumber());

        //B影响A
        collB.setNumber(1000, collA);
        System.out.println("collA: " + collA.getNumber());
        System.out.println("collB: " + collB.getNumber());

        //collC和collD和collE相互影响，collE是collD的10倍，是collC的100倍
        AbstractColleague2 collC = new ColleagueC();
        AbstractColleague2 collD = new ColleagueD();
        AbstractColleague2 collE = new ColleagueE();

        //使用处理C,D,E的中介，具体中介为Mediator，处理特定关系
        AbstractMediator mediator = new Mediator(collC, collD, collE);
        //传入中介
        collC.setNumber(1000, mediator);
        System.out.println("collC: " + collC.getNumber());
        System.out.println("collD: " + collD.getNumber());
        System.out.println("collE: " + collE.getNumber());

        //传入中介
        collD.setNumber(1000, mediator);
        System.out.println("collC: " + collC.getNumber());
        System.out.println("collD: " + collD.getNumber());
        System.out.println("collE: " + collE.getNumber());

        //传入中介
        collE.setNumber(1000, mediator);
        System.out.println("collC: " + collC.getNumber());
        System.out.println("collD: " + collD.getNumber());
        System.out.println("collE: " + collE.getNumber());
    }
}
