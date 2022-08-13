package com.atguigu.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton {
    private Singleton() {
    }
//单例模式，采用静态内部类的方式创建对象
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}