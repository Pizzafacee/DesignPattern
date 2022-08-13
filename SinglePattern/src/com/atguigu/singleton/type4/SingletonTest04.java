package com.atguigu.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {

    }
}

//懒汉式（解决线程安全问题，但是效率较低）
class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    //同步代码解决安全问题
    public synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
