package interfaces.ex8_interface;

interface Interface {
    void method();
}

class BaseClass {
    public void method(){
        System.out.println("Method - BaseClass.method()");
    }
}

class DerivedClass extends BaseClass implements Interface {
    //The implementation of interface is optional,
    // because the signatures of the methods in the class and interface are the same.
}

public class Main {

    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        Interface instance1 = (Interface) instance;
        instance1.method();
    }

}
