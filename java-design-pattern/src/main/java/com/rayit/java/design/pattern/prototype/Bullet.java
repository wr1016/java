package com.rayit.java.design.pattern.prototype;

/**
 * 子弹类
 */
public class Bullet implements Cloneable {

    /**
     * 子弹大小尺寸
     */
    private int size;

    /**
     * 子弹重量
     */
    private int weight;

    public Bullet(){

    }

    public Bullet(int size, int weight){
        this.size = size;
        this.weight = weight;
    }

    @Override
    public Bullet clone() throws CloneNotSupportedException {
        //这里JVM会进行内存操作直接拷贝原始数据流，简单粗暴，不会有其他更多的复杂操作（类加载，实例化，初始化等等），速度远远快于实例化操作
        return (Bullet) super.clone();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
