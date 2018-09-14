package com.svlugovoy.effectivejava.creatingdestoyingobjects._003_singletons;

public class Runner {


    public static void main(String[] args) {

        SingletonWithField swf = SingletonWithField.INSTANCE;
        swf.doSomeWork();

        SingletonWithStaticFactory swsf = SingletonWithStaticFactory.getInstance();
        swsf.doSomeWork();

        SingletonWithEnum swe = SingletonWithEnum.INSTANCE;
        swe.doSomeWork();
    }
}
