package com.ing.zoo;

import com.ing.zoo.animalInterface.Carnivor;
import com.ing.zoo.animalInterface.Herbivor;
import com.ing.zoo.model.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Cheetah kenya = new Cheetah();
        kenya.name = "kenya";
        Squirrel timo = new Squirrel();
        timo.name = "timo";

        Animal[] animals = new Animal[7];
        animals[0] = henk;
        animals[1] = elsa;
        animals[2] = dora;
        animals[3] = wally;
        animals[4] = marty;
        animals[5] = kenya;
        animals[6] = timo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0]))
        {
            for (Animal animal: animals) {
                animal.sayHello();
            }
        }
        else if(input.contains(commands[0] + " "))
        {
            String name = input.substring(6);
            boolean itContains = false;
            for (Animal animal: animals) {
                if(animal.name.equals(name)){
                    itContains = true;
                    animal.sayHello();
                }
            }

            if(!itContains){
                System.out.println("Unknown command: " + input);
            }
        }
        else if (input.equals(commands[1])) {
            for (Animal animal: animals) {
                if(animal instanceof Herbivor) {
                    ((Herbivor) animal).eatLeaves();
                }
            }
        }
        else if (input.equals(commands[2])) {
            for (Animal animal: animals) {
                if(animal instanceof Carnivor) {
                    ((Carnivor) animal).eatMeat();
                }
            }
        }
        else if (input.equals(commands[3])) {
            for (Animal animal: animals) {
                if(animal instanceof Pig) {
                    ((Pig) animal).performTrick();
                }
                if(animal instanceof Tiger) {
                    ((Tiger) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
