package com.ing.zoo.model;

import com.ing.zoo.animalInterface.Herbivor;

public class Hippo extends Animal implements Herbivor {

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
