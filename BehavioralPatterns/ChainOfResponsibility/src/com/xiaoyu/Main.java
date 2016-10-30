package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 职责链模式
 * 职责链模式通过PurchasePower搭建抽象过滤方式，并且提供继任者设定接口
 * 各个具体角色继承PurchasePower，并且根据角色设定继任者，形成职责链
 * 当请求传入时，一层一层试图处理请求，无权限则交给高一级权限的角色
 */
public class Main {
    public static void main(String[] args) {
        //搭建职责链
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        manager.processRequest(new PurchaseRequest(20000, "general"));
    }
}
