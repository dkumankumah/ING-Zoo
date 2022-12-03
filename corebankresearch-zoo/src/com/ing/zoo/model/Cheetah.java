package com.ing.zoo.model;

import com.ing.zoo.animalInterface.Carnivor;

public class Cheetah extends Animal implements Carnivor {
    @Override
    public void sayHello() {
        helloText = "mmraauww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "tjak tjak krak";
        System.out.println(eatText);
    }
}
