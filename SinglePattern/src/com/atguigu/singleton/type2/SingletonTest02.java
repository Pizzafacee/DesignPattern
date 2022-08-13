package com.atguigu.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton {
    //饿汉式（在静态代码块中创建对对象）
    private Singleton() {
    }

    private static Singleton instance;

    static {
        Singleton.instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
