package com.rayit.java.design.pattern.prototype;

public class EnemyPlane implements Cloneable {

    //    private Bullet bullet = new Bullet();
    private Bullet bullet;

    /**
     * 敌机横坐标
     */
    private int x;

    /**
     * 敌机纵坐标
     */
    private int y = 0;

    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly() {//让敌机飞
        y++;//每调用一次，敌机飞行时纵坐标＋1
    }

    //此处开放setX，为了让克隆后的实例重新修改x坐标
    public void setX(int x) {
        this.x = x;
    }

    //为了保证飞机飞行的连贯性
    //这里我们关闭setY方法，不支持随意更改Y纵坐标
//    public void setY(int y) {
//        this.y = y;
//    }

    /**
     * 重写克隆方法. 这里JVM会进行内存操作直接拷贝原始数据流，简单粗暴，不会有其他更多的复杂操作（类加载，实例化，初始化等等），速度远远快于实例化操作
     */
    @Override
    public EnemyPlane clone() throws CloneNotSupportedException {
        //先克隆出敌机，其中子弹还未进行克隆
        EnemyPlane clonePlane = (EnemyPlane) super.clone();
        //对子弹进行深拷贝
        clonePlane.setBullet(this.bullet.clone());
        return clonePlane;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public String toString() {
        return String.format("EnemyPlane[x=%s,y=%s], Bullet[size=%s,weight=%s]", x, y, getBullet().getSize(), getBullet().getWeight());
    }
}
