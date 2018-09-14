package com.svlugovoy.effectivejava.creatingdestoyingobjects._002_builder;

import static com.svlugovoy.effectivejava.creatingdestoyingobjects._002_builder.NyPizza.Size.*;
import static com.svlugovoy.effectivejava.creatingdestoyingobjects._002_builder.Pizza.Topping.*;

public class Runner {

    public static void main(String[] args) {

        System.out.println(new NutritionFacts.Builder(100, 5).build());
        System.out.println(new NutritionFacts.Builder(100, 5).calories(450).build());
        System.out.println(new NutritionFacts.Builder(100, 5).calories(450).carbohydrate(95).build());


        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

    }
}
