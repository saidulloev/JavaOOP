package interfaces.ex6_interface;

interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    //implementation of abstract method from  interface, in abstract class is optional
    @Override
    public void method() {
        System.out.println("Method - implementation interface method in abstract method");
    }
}

class ConcreteClass extends AbstractClass {

}

public class Main {

    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }

}
