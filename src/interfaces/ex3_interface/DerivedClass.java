package interfaces.ex3_interface;

public class DerivedClass extends BaseClass implements SomeInterface1,SomeInterface2 {

    @Override
    public void someMethod1(){
        System.out.println("someMethod1() - interface implementation");
    }

    @Override
    public void someMethod2(){
        System.out.println("someMethod2() - interface implementation");
    }

}
