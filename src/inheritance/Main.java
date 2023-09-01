package inheritance;

public class Main {

    public static void main(String[] args) {

        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);    //DerivedClass.publicField
        System.out.println(instance.protectedField); //DerivedClass.protectedField

        instance.show();

        DerivedClass instance2 = new DerivedClass(2,1);
        System.out.println(instance2.baseNumber);
        System.out.println(instance2.derivedNumber);

    }

}
