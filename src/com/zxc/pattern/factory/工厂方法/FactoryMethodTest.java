package com.zxc.pattern.factory.工厂方法;

/**
 * @author zhouxingcan
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //先创建具体的工厂
        IPhoneFactory phoneFactory=new HuaWeiFactory();
        //具体工厂再生产具体产品,这样客户端就不知道，产品的具体创建细节
        IPhone phone=phoneFactory.create();
        phone.show();

        phoneFactory=new XiaoMiFactory();
        IPhone phone2=phoneFactory.create();
        phone2.show();
    }
}
