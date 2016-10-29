package com.xiaoyu;

/**
 * Created by gxytk on 2016/9/27.
 */
public class Product {

    //Assume product is produced by step1, step2 and step3

    // Step1 of product
    private String step1;

    // Step2 of product
    private String step2;

    // Step3 of product
    private String step3;

    public void setStep1(String step1){
        this.step1 = step1;
    }

    public String getStep1(){
        return step1;
    }

    public void setStep2(String step2){
        this.step2 = step2;
    }

    public String getStep2(){
        return "In the premise that " + step1 + ", " + step2;
    }

    public void setStep3(String step3){
        this.step3 = step3;
    }

    public String getStep3(){
        return "In the premise that " + step2 + ", " + step3;
    }

    // Ensure the product is produced
    public boolean isProduced(){
        if(!step1.isEmpty()&&!step2.isEmpty()&&!step3.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
