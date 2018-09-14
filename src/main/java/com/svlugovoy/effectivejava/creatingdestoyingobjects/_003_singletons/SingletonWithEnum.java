package com.svlugovoy.effectivejava.creatingdestoyingobjects._003_singletons;

public enum SingletonWithEnum {

    INSTANCE;

    public void doSomeWork() {
        System.out.println("...");
    }
}
