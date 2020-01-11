package com.rayit.java.design.pattern.prototype;

import java.util.Random;

public class PlayGame {

    private static final int enemyPlaneCount = 100;

    public static void main(String[] args) throws CloneNotSupportedException {
        // 造一种型号子弹
        Bullet bullet = new Bullet(1, 50);

        Random random = new Random(enemyPlaneCount);
        int i = 0;
        while (i < enemyPlaneCount) {
            EnemyPlane enemyPlane = EnemyPlaneFactory.getInstance(random.nextInt(), bullet);
            System.out.println("enemyPlane" + i + " = " + enemyPlane.toString());
            i++;
        }
    }
}
