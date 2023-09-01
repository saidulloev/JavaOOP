package classes_objects.animal;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(2, "Marsel", 7.5);
        cat.setWeight(4.5);
        System.out.println(cat.getAge() + " " + cat.getName() + " " + cat.getWeight());
    }

}
