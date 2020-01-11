package com.rayit.java.design.pattern.adapter;

/**
 * 类适配器
 */
public class ClassAdapter extends TV implements TriplePin {
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
