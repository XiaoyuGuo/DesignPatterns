package com.xiaoyu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        Director director = new Director(concreteBuilder1);
        director.construct();
    }
}
