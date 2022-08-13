package com.atguigu.factory.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    abstract Pizza createPizza(String type);

    public OrderPizza() {
        Pizza pizza = null;
        String type = getType();
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }

    private  String getType(){
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = string.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
