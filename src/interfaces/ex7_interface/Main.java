package interfaces.ex7_interface;

interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    @Override
    public void method(){
        System.out.println("Method - implementation interface method in abstract method");
    }
}

public class Main {

    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }

}
