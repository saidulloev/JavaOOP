package classes_objects;

public class Main {

    public static void main(String[] args) {

        Car audi = new Car("Audi A7",250,5);
        audi.setMaxSpeed(300);
        System.out.println(audi.getModel() + " " + audi.getMaxSpeed() + " " + audi.getYear());

    }

}
