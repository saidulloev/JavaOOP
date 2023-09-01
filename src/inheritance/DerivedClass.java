package inheritance;

//Произвольный класс  ---  DerivedClass - дочерний класс, BaseClass - родительский класс
public class DerivedClass extends BaseClass {

    public int derivedNumber;

    //constructor
    public DerivedClass() {
        //change all available fields extending BaseClass
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }

    public DerivedClass(int number1, int number2) {
//        this.baseNumber = number1;
        super(number1);
        this.derivedNumber = number2;
    }

}
