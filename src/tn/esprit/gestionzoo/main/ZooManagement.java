package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Test","Lion",14, false);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(tn.esprit.gestionzoo.entities.Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

        //Prosit5
        Aquatic Aquatic1 = new Aquatic("h","aziz",22,true,"beja");
        Terrestrial terrestrial1 = new Terrestrial("z","jacem",23,true,4);
        Dolphin Dolphin1 = new Dolphin("d","dali",24,false,"beja",2);
        Penguin Penquin1 = new Penguin("e","omar",25,false,"beja",1);

        System.out.println(Aquatic1.toString());
        System.out.println(terrestrial1.toString());
        System.out.println(Dolphin1.toString());
        System.out.println(Penquin1.toString());

        Dolphin1.swim();
        Aquatic1.swim();
        Penquin1.swim();
    }

}
