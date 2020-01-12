package com.rayit.java.design.pattern.state.car;

public class CarClient {
    public static void main(String[] args) {
        GearSwitcher switcher = new GearSwitcher();
        switcher.switchPark();
        switcher.switchDrive();
        switcher.switchNeutral();
        switcher.switchNeutral();
        switcher.switchReverse();
        switcher.switchPark();
    }
}
