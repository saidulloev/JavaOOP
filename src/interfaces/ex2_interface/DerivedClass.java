package interfaces.ex2_interface;

public class DerivedClass implements SomeInterface1, SomeInterface2 {

    @Override
    public void someMethod1(){
        System.out.println("Method1 - interface implementation");
    }

    @Override
    public void someMethod2(){
        System.out.println("Method2 - interface implementation");
    }

}
