package com.rayit.java.design.pattern.state.car;

public class GearSwitcher {
    // 初始档位为“Park停车档”
    private GearState state = new Park();

    public GearState getState() {
        return state;
    }

    public void setState(GearState state) {
        this.state = state;
    }

    /**
     * 倒车档
     */
    public void switchReverse() {
        state.switchReverse(this);
    }

    /**
     * 空档
     */
    public void switchNeutral() {
        state.switchNeutral(this);
    }

    /**
     * 前进档
     */
    public void switchDrive() {
        state.switchDrive(this);
    }

    /**
     * 停车档
     */
    public void switchPark() {
        state.switchPark(this);
    }
}
