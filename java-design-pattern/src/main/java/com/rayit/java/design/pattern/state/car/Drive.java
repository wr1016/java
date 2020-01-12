package com.rayit.java.design.pattern.state.car;

public class Drive implements GearState {
    /**
     * Park驻车档
     *
     * @param gearSwitcher
     */
    @Override
    public void switchPark(GearSwitcher gearSwitcher) {
        gearSwitcher.setState(new Park());
        System.out.println("成功切换至停车档。");
    }

    /**
     * Reverse倒退挡
     *
     * @param gearSwitcher
     */
    @Override
    public void switchReverse(GearSwitcher gearSwitcher) {
        gearSwitcher.setState(new Reverse());
        System.out.println("成功切换至倒退挡。");
    }

    /**
     * Neutral空挡
     *
     * @param gearSwitcher
     */
    @Override
    public void switchNeutral(GearSwitcher gearSwitcher) {
        gearSwitcher.setState(new Neutral());
        System.out.println("成功切换至空挡。");
    }

    /**
     * Drive前进档
     *
     * @param gearSwitcher
     */
    @Override
    public void switchDrive(GearSwitcher gearSwitcher) {
        System.out.println("注意！已是前进档。");
    }
}
