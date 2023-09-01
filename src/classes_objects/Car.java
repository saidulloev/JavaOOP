package classes_objects;

public class Car {

    private String model;
    private int maxSpeed;
    private int year;

    public Car(){

    }

    public Car(String model, int maxSpeed, int year) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
