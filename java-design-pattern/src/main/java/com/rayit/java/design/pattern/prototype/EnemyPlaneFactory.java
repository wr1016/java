package com.rayit.java.design.pattern.prototype;

public class EnemyPlaneFactory {
    // 此处用痴汉模式造一个敌机原型
    private static EnemyPlane enemyPlane = new EnemyPlane(200);

    //获取敌机克隆实例
    public static EnemyPlane getInstance(int x, Bullet bullet) throws CloneNotSupportedException {
        //设定子弹
        enemyPlane.setBullet(bullet);
        //复制原型机
        EnemyPlane clone = enemyPlane.clone();
        //重新设置克隆机的x坐标
        clone.setX(x);

        return clone;
    }
}
