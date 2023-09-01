package interfaces.ex1_interface;

interface Interface{
     void method();
}

class MyClass implements Interface{

    @Override
    public void method(){
        System.out.println("Method - interface implementation");
    }

}

public class Main {

    public static void main(String[] args) {
        MyClass instance = new MyClass();
        instance.method();
    }

}
