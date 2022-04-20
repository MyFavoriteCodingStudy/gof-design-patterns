
public interface Duck {
    public void quack();

    public void fly();
}

class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying.Duck");
    }
}

interface Turkey {
    public void gobble();

    public void fly();
}

class MallardTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying.Turkey");
    }

}