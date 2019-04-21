package com.zxc.pattern.factory.工厂方法;

/**
 * 抽象工厂
 * @author zhouxingcan
 */
public interface IPhoneFactory {
    /**
     * 创建具体的手机
     * @return
     */
    public IPhone create();
}
