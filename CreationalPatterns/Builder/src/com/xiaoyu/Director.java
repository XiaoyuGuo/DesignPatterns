package com.xiaoyu;

/**
 * Created by gxytk on 2016/9/27.
 */
public class Director {
    private AbstractBuilder abstractBuilder;

    public Director(AbstractBuilder abstractBuilder){
        this.abstractBuilder = abstractBuilder;
    }

    public Product construct(){
        System.out.println("Start constructing product...");
        abstractBuilder.executeStep1();
        abstractBuilder.executeStep2();
        abstractBuilder.executeStep3();
        if (abstractBuilder.isProductProduced()){
            System.out.println("Finished construction");
            return abstractBuilder.getProduct();
        }else{
            System.out.println("Construction error");
            System.exit(0);
            return null;
        }
    }
}
