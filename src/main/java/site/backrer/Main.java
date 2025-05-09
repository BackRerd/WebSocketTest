package site.backrer;

import site.backrer.Day10.Eagle;
import site.backrer.Day10.Lion;
import site.backrer.Day10.Penguin;
import site.backrer.Day10.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Eagle eagle = new Eagle("老鹰",120);
        Lion lion = new Lion("狮子",20);
        Penguin penguin = new Penguin("企鹅",10);

        zoo.addAnimal(eagle);
        zoo.addAnimal(lion);
        zoo.addAnimal(penguin);
        zoo.showAllAnimals();
        System.out.println("子类方法");
        lion.roar();
        penguin.swim();
        eagle.fly();
    }
}