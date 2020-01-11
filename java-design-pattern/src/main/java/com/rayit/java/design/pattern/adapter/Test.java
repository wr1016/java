package com.rayit.java.design.pattern.adapter;

public class Test {

    public static void main(String[] args) {
        TV tv = new TV();
        // 对象适配器
        Adapter adapter = new Adapter(tv);
        adapter.electrify(101, 121, 0);
        // 类适配器
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.electrify(202, 302, 0);
    }
}
