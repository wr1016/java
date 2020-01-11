package com.rayit.java.design.pattern.singleton;

/**
 * 痴汉模式（Eager load）
 */
public class EagerGod {
    /**
     * 自有永有的神单例
     */
    private static final EagerGod god = new EagerGod();

    /**
     * 构造方法私有化: private
     */
    private EagerGod() {
    }

    /**
     * 请神方法公开化
     *
     * @return
     */
    public static EagerGod getInstance() {
        return god;
    }
}
