package com.svlugovoy.effectivejava.creatingdestoyingobjects._003_singletons;

public class SingletonWithField {

    public static final SingletonWithField INSTANCE = new SingletonWithField();

    private SingletonWithField() {
    }

    public void doSomeWork() {
        System.out.println("...");
    }
}
