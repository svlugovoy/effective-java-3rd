package com.svlugovoy.effectivejava.creatingdestoyingobjects._001_staticfactorymethods;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        MyTest t1 = MyTest.valueOf("Hello");
        System.out.println(t1);

        MyTest t2 = MyTest.getNewDefaultInstance();
        MyTest t3 = MyTest.getNewDefaultInstance();
        System.out.println(t2);
        System.out.println(t2 == t3);

        MyTest t4 = MyTest.getSingletonDefaultInstance();
        MyTest t5 = MyTest.getSingletonDefaultInstance();

        System.out.println(t4);
        System.out.println(t4 == t5);

        System.out.println(MyCollections.newArrayList().getClass().getCanonicalName());
        System.out.println(MyCollections.newLinkedList().getClass().getCanonicalName());

        List<String> list = MyCollections.of("One", "Two");
        System.out.println(list.getClass().getCanonicalName());
        System.out.println(list);

    }

}
