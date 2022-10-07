package com.company;

public class Woman extends Human{
    public Woman(String name, int age, int numberOfLegs, String skin, int idNumber) {
        super(name, age, numberOfLegs, skin, idNumber);
    }

    public void cook(){
        System.out.println("Uvarim ti vsechno");
    }

    public int getAge(){
        System.out.println("Nic ti nepovim");
        return 0;

    }
}
