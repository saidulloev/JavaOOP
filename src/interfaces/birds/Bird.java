package interfaces.birds;

public abstract class Bird implements Live{

    public abstract void move();
    public void eat(){
        System.out.println("I can eat");
    }

    @Override
    public void live(){
        System.out.println("I can live");
    }

}
