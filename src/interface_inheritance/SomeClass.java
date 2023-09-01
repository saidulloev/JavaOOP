package interface_inheritance;

public class SomeClass implements Interface1, Interface2, Interface3 {

    @Override
    public void method1() {
        System.out.println("method1()");
    }

    @Override
    public void method2() {
        System.out.println("method2()");
    }

    @Override
    public void method3() {
        System.out.println("method3()");
    }
}
