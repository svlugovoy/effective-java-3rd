package com.svlugovoy.effectivejava.creatingdestoyingobjects._001_staticfactorymethods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class MyCollections<T> {

    private MyCollections() {
    }

    public static <T> List<T> newArrayList(){
        return new ArrayList<>();
    }

    public static <T> List<T> newLinkedList(){
        return new LinkedList<>();
    }

    public static <T> List<T> of(T... elements){
        List<T> list = new ArrayList<>();
        Stream.of(elements).forEach(list::add);
        return list;
    }

}
