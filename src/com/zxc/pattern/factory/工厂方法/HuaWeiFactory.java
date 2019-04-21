package com.zxc.pattern.factory.工厂方法;

/**
 * 华为手机工厂
 * @author zhouxingcan
 */
public class HuaWeiFactory implements IPhoneFactory{
    /**
     * 直接返回华为手机对象。
     * @return
     */
    @Override
    public IPhone create() {
        return new HuaWeiPhone();
    }
}
