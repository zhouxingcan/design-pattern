package com.zxc.pattern.factory;

/**
 * @author zhouxingcan
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        IProduct product=SimpleFactory.crateProduct("productA");
        product.doSoming();
        IProduct product2=SimpleFactory.crateProduct("productb");
        product2.doSoming();
    }

}

