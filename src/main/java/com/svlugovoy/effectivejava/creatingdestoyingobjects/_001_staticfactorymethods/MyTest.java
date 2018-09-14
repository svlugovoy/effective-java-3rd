package com.svlugovoy.effectivejava.creatingdestoyingobjects._001_staticfactorymethods;

public class MyTest {
    private String str;

    private static final MyTest INSTANCE = new MyTest("Default");

    private MyTest(String str) {
        this.str = str;
    }

    public static MyTest valueOf(String str){
        return new MyTest(str);
    }

    public static MyTest getNewDefaultInstance(){
        return new MyTest("Default");
    }

    public static MyTest getSingletonDefaultInstance(){
        return INSTANCE;
    }


    @Override
    public String toString() {
        return "MyTest{" +
                "str='" + str + '\'' +
                '}';
    }
}
