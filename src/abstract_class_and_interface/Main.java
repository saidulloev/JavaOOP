package abstract_class_and_interface;

public class Main {

    public static void main(String[] args) {

        Bird penguin = new Penguin();
        Bird strauss = new Strauss();
        Bird swallow = new Swallow();

        Bird[] arrBirds = {penguin, strauss, swallow};

        for (Bird temp : arrBirds) {
            temp.move();
        }

        System.out.println("--------------------------------");

        AbstractClass instance = new ConcreteClass();
        instance.method();
    }

}

abstract class AbstractClass {
    public abstract void method();
}

class ConcreteClass extends AbstractClass {

    @Override
    public void method() {
        System.out.println("Implementation");
    }
}
