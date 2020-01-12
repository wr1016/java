package com.rayit.java.design.pattern.template_method.mammal;

public class Human extends Mammal {
    @Override
    public void move() {
        System.out.println("两条腿走路……");
    }
}
