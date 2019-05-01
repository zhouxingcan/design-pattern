package com.zxc.pattern.factory.抽象工厂;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        //创建小米产品族工厂工厂
        AbstractFactory af=new XiaoMiFactory();
        IComputer computer=af.createComputer();
        computer.show();
        IPhone phone=af.createPhone();
        phone.show();
    }
}
