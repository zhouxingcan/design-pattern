package com.zxc.pattern.factory.工厂方法;

public class XiaoMiFactory implements IPhoneFactory{
    @Override
    public IPhone create() {
        return new XiaoMiPhone();
    }
}
