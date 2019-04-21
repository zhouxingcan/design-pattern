package com.zxc.pattern.factory;

/**
 *  @author zhouxingcan
 * 简单工厂，用于生产产品
 */
public class SimpleFactory {
    public static IProduct crateProduct(String name){
        if("ProductA".equalsIgnoreCase(name)){
            return new ProductA();
        }else if("ProductB".equalsIgnoreCase(name)){
            return new ProductB();
        }
        return null;
    }
}
