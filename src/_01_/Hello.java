package _01_;

public class Hello {
    public static void main(String[] args) {
        SuperMan sm = new SuperMan("Jack",18);
        System.out.println(sm.toString());
        sm.fight();
        sm.fly();
    }
}
