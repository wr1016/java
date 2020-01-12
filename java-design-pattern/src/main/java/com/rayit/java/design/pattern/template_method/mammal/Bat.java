package com.rayit.java.design.pattern.template_method.mammal;

public class Bat extends Mammal {
    @Override
    public void move() {
        System.out.println("用翅膀飞……");
    }
}
