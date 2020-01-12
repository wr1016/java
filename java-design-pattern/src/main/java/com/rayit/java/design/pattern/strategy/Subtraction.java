package com.rayit.java.design.pattern.strategy;

public class Subtraction implements Strategy {
    @Override
    public int calculate(int a, int b) {//减数与被减数
        return a - b;//这里我们做减法运算
    }
}
