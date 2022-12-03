package com.ing.zoo.model;

import com.ing.zoo.animalInterface.Herbivor;

public class Squirrel extends Animal implements Herbivor {
    @Override
    public void sayHello() {
        helloText = "hiihii";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "knabbel knabbel crunchy";
        System.out.println(eatText);
    }
}
