package interfaces.ex3_interface;

public class Main {

    public static void main(String[] args) {

        DerivedClass myClass = new DerivedClass();
        myClass.method();
        myClass.someMethod1();
        myClass.someMethod2();

        BaseClass baseClass = new DerivedClass();

        SomeInterface1 instance1 = new DerivedClass();
        SomeInterface2 instance2 = new DerivedClass();

        baseClass.method();

        instance1.someMethod1();
//        instance1.someMethod2();
//        instance1.method();

//        instance2.someMethod1();
        instance2.someMethod2();
//        instance2.method();

    }

}
