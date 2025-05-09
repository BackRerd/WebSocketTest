package site.backrer.Day10;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void showAllAnimals(){
        for (Animal animal : animals) {
            System.out.printf("%s（%d岁）：", animal.getName(), animal.getAge());
            animal.eat();

        }
    }
}
