package com.atguigu.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }

}

//单例模式（懒汉式）只有在调用getInstance时才会创建对象，但会引发线程安全问题
class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
