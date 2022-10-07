package com.company;

public class Main {

    public static void main(String[] args) {
       /* Man myMan = new Man("Petr", 18, 1, "dark",1151514);
        myMan.walk();
        myMan.greetings();
        myMan.talk();
        Woman myWoman = new Woman("Adela",18,2,"light",148923);
        myWoman.walk();
        myWoman.greetings();
        myWoman.talk();
        myWoman.talk();
        myWoman.talk();
        myWoman.talk();
        myWoman.talk();
        myMan.cook();
        myWoman.cook();
        System.out.println(myMan.getAge());
        System.out.println(myWoman.getAge());*/

        System.out.println("Zvire dela: ");
        Animal myAnimal = new Animal();
        myAnimal.sound();
        System.out.println("Pes dela: ");
        Dog myDog = new Dog();
        myDog.sound();
        System.out.println("Kocka dela: ");
        Cat myCat = new Cat();
        myCat.sound();
        System.out.println("Ovce dela: ");
        Sheep mySheep = new Sheep();
        mySheep.sound();
    }
}
