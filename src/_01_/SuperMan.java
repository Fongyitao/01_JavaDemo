package _01_;

public class SuperMan extends Human implements Fly{
    public SuperMan() {
    }

    public SuperMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    void fight() {
        System.out.println("~铁拳~");
    }
}
