package com.rayit.java.design.pattern.adapter;

public class TV implements DualPin {

    /**
     * 既然是两项插头，当然实现两项插标准
     *
     * @param l
     * @param n
     */
    @Override
    public void electrify(int l, int n) {
        System.out.println("火线通电：" + l);
        System.out.println("零线通电：" + n);
    }
}
