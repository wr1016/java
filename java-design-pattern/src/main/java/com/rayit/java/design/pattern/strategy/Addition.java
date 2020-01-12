package com.rayit.java.design.pattern.strategy;

public class Addition implements Strategy {
    @Override
    public int calculate(int a, int b) {//加数与被加数
        return a + b;//这里我们做加法运算
    }
}
