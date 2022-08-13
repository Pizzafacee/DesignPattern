package com.atguigu.factory.simpleFactory;

public class BeijinOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String type) {
        if("beijingPizza".equals(type)){
           return new BeiJinPizza();
        }else return null;
    }
}
