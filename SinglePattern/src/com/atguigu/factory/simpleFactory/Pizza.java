package com.atguigu.factory.simpleFactory;

public abstract class Pizza {
    String pizzaName;

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    void prepare(){
        System.out.println("准备"+pizzaName);
    }
    void bake(){
        System.out.println("烘焙"+pizzaName);
    }
    void cut(){
        System.out.println("切割"+pizzaName);
    }
}
