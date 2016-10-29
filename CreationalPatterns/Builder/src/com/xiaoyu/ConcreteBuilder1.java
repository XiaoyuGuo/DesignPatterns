package com.xiaoyu;

/**
 * Created by gxytk on 2016/9/27.
 */
public class ConcreteBuilder1 extends AbstractBuilder {
    @Override
    public void executeStep1() {
        System.out.println("Executing step1...");
        product.setStep1("step1 is finished");
        System.out.println(product.getStep1());
    }

    @Override
    public void executeStep2() {
        System.out.println("Executing step2...");
        product.setStep2("step2 is finished");
        System.out.println(product.getStep2());
    }

    @Override
    public void executeStep3() {
        System.out.println("Executing step3...");
        product.setStep3("step3 is finished");
        System.out.println(product.getStep3());
    }

    @Override
    public boolean isProductProduced(){
        if(product.isProduced()){
            return true;
        }else{
            return false;
        }
    }

}
