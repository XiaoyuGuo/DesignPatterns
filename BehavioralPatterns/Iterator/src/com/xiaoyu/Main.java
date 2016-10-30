package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 迭代器模式
 * 这里自己实现了迭代接口作为实验
 * 对于java来说实际并没有什么卵用
 */
public class Main {
    public static void main(String[] args) {
        Test<String> test = new Test<>(new String[]{"asdfadsf", "basdfasdf"});
        for(String str : test) {
            System.out.println(str);
        }
    }
}
