package com.rayit.java.design.pattern.state.car;

/**
 * 档位状态
 */
public interface GearState {
    /**
     * Park驻车档
     */
    public void switchPark(GearSwitcher gearSwitcher);

    /**
     * Reverse倒退挡
     */
    public void switchReverse(GearSwitcher gearSwitcher);

    /**
     * Neutral空挡
     */
    public void switchNeutral(GearSwitcher gearSwitcher);

    /**
     * Drive前进档
     */
    public void switchDrive(GearSwitcher gearSwitcher);
}
