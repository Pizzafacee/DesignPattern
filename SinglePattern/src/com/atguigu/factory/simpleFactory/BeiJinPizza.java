package com.atguigu.factory.simpleFactory;

public class BeiJinPizza extends Pizza{
    @Override
    void prepare() {
        setPizzaName("beijingPizza");
        super.prepare();
    }

    @Override
    void bake() {
       setPizzaName("beijingPizza");
        super.bake();
    }

    @Override
    void cut() {
        setPizzaName("beijingPizza");
        super.cut();
    }
}
