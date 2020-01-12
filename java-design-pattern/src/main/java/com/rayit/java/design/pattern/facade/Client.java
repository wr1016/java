package com.rayit.java.design.pattern.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.provideService();
    }
}
