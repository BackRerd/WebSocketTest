package site.backrer.Day10;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狮子在吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
    public void roar(){
        System.out.println("狮子发出吼叫");
    }
}
