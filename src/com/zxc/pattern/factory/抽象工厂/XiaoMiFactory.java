package com.zxc.pattern.factory.抽象工厂;

/**
 * 小米产品族
 * @author zhouxingcan
 */
public class XiaoMiFactory implements AbstractFactory{

    @Override
    public IPhone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new XiamMiComputer();
    }

    @Override
    public IYinXiang createYinXiang() {
        return new XiaoAi();
    }
}
