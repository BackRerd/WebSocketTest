package site.backrer.Day10;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("老鹰在吃肉");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {
        System.out.println("老鹰在飞翔");
    }

}
