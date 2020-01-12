package com.rayit.java.design.pattern.decorator;

public class Decorator implements Showable {
    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();//直接调用不做加任何粉饰。
    }
}
