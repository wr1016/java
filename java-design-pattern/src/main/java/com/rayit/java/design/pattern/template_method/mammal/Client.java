package com.rayit.java.design.pattern.template_method.mammal;

public class Client {
    public static void main(String[] args) {
        System.out.println("人类");
        Human human = new Human();
        human.feedMilk(true);
        human.move();

        System.out.println("鲸鱼");
        Whale whale = new Whale();
        whale.feedMilk(false);
        whale.move();

        System.out.println("蝙蝠");
        Bat bat = new Bat();
        bat.feedMilk(true);
        bat.move();
    }
}
