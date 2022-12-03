package com.ing.zoo.model;

import com.ing.zoo.animalInterface.Carnivor;
import com.ing.zoo.animalInterface.Herbivor;

import java.util.Random;

public class Pig extends Animal implements Carnivor, Herbivor {

    public String trick;

    public Pig()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
