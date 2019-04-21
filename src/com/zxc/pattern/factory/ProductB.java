package com.zxc.pattern.factory;

/**
 *  @author zhouxingcan
 * 具体产品
 */
public class ProductB implements IProduct{
    public ProductB(){
        System.out.println("productB");
    }
    @Override
    public void doSoming() {
        System.out.println("产品B——doSoming");
    }
}
