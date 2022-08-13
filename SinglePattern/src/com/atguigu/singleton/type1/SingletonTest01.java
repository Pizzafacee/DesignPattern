package com.atguigu.singleton.type1;

import java.lang.reflect.Constructor;

public class SingletonTest01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        //com.atguigu.singleton.type1.Singleton singleton = new com.atguigu.singleton.type1.Singleton();构造器私有，外部无法new对象
        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> constructor = singletonClass.getConstructor();
        constructor.setAccessible(true);
        //com.atguigu.singleton.type1.Singleton singleton = singletonClass.newInstance();
        //System.out.println(singleton==instance);反射也无法构造对象,需要破坏封装才能构造对象
    }
}

//单例模式（饿汉式）
class Singleton {
    //私有化构造器
    private Singleton() {

    }

    //创建一个私有化的静态变量
    private static Singleton instance = new Singleton();

    //创建一个公共的方法，让外部去调用该方法以获得对象
    public static Singleton getInstance() {
        return instance;
    }
}
