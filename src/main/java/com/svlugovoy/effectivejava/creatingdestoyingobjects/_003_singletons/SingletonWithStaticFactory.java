package com.svlugovoy.effectivejava.creatingdestoyingobjects._003_singletons;

public class SingletonWithStaticFactory {

    private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

    private SingletonWithStaticFactory() {
    }

    public static SingletonWithStaticFactory getInstance() {
        return INSTANCE;
    }

    public void doSomeWork() {
        System.out.println("...");
    }

}
