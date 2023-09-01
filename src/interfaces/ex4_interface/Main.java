package interfaces.ex4_interface;

interface Interface1{
    void method1();
}

interface Interface2 extends Interface1{    // when interface need inheritance some other interface we wrote EXTENDS not implements
     void method2();
}

class ConcreteClass implements Interface2{

    @Override
    public void method1() {
        System.out.println("method1 - Interface1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("method2 - Interface2 implementation");
    }
}

public class Main {

    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method1();
        instance.method2();

        Interface1 instance1 = (Interface1) instance;
        instance1.method1();

        Interface2 instance2 = (Interface2) instance;
        instance2.method1();
        instance2.method2();

    }

}
