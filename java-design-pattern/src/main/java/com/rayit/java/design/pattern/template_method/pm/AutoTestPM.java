package com.rayit.java.design.pattern.template_method.pm;

public class AutoTestPM extends PM {
    @Override
    protected void analyze() {
        System.out.println("进行业务沟通，需求分析");
    }

    @Override
    protected void design() {
        System.out.println("系统设计OK");
    }

    @Override
    protected void develop() {
        System.out.println("代码开发完成");
    }

    @Override
    protected boolean test() {
        System.out.println("自动化测试通过");
        return true;
    }

    @Override
    protected void release() {
        System.out.println("项目发布OK");
    }
}
