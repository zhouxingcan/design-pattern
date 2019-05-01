package com.zxc.pattern.factory.抽象工厂;

public interface AbstractFactory {
    /**
     * 生产手机
     * @return
     */
    IPhone createPhone();

    IComputer createComputer();

    IYinXiang createYinXiang();
}
