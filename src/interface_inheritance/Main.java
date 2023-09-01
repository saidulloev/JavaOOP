package interface_inheritance;

public class Main {

    public static void main(String[] args) {

        SomeClass instance = new SomeClass();
        instance.method1();

        //UpCast
        Interface1 instanceUp1 = instance;
        instanceUp1.method1();
//        instanceUp1.method2(); error
//        instanceUp1.method3(); error

        //UpCast
        Interface2 instanceUp2 = instance;
//        instanceUp2.method1(); error
        instanceUp2.method2();
//        instanceUp2.method3(); error

        //UpCast
        Interface3 instanceUp3 = instance;
//        instanceUp3.method1(); error
//        instanceUp3.method2(); error
        instanceUp3.method3();

        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();

    }

}
