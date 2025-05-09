package site.backrer.Day10;

public class Penguin extends Animal {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("企鹅在吃鱼");
    }

    @Override
    public void sleep() {

    }
    public void swim(){
        System.out.println("企鹅在游泳");
    }
}
