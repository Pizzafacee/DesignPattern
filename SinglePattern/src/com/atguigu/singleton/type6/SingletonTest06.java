package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

//单例模式 双重检查，既可以解决线程安全问题，也可以解决效率问题,也使用了懒加载，建议使用
class Singleton {
    private Singleton() {

    }

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
