package com.zxc.pattern.factory;

/**
 *  @author zhouxingcan
 */
public class ProductA implements IProduct{
    public ProductA(){
        System.out.println("productA");
    }
    @Override
    public void doSoming() {
        System.out.println("产品A———doSoming");
    }
}
