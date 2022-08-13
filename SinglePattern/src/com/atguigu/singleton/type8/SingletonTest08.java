package com.atguigu.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        instance.sayHello();
    }
}

//利用枚举来实现单例模式，次方法也是被推荐使用的
enum Singleton {
    INSTANCE;

    public void sayHello() {
        System.out.println("hello~");
    }
}
