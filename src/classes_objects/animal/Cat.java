package classes_objects.animal;

public class Cat extends Animal{

     private int age;

    public Cat(int age, String name, double weight){
        super(name,weight);
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
