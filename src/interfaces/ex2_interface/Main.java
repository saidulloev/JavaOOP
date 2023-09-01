package interfaces.ex2_interface;

public class Main {

    public static void main(String[] args) {

        SomeInterface1 instance1 = new DerivedClass();
        SomeInterface2 instance2 = new DerivedClass();
        DerivedClass derivedClass = new DerivedClass();

        instance1.someMethod1();
//        instance1.someMethod2(); // SomeInterface1 cannot resolve method "SomeMethod2()"

//        instance2.someMethod1(); //SomeInterface2 cannot resolve method "SomeMethod1()"
        instance2.someMethod2();

        System.out.println("----------------------------------");

        derivedClass.someMethod1();
        derivedClass.someMethod2();
    }

}
