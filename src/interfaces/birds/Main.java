package interfaces.birds;

public class Main {

    public static void main(String[] args) {

        Bird penguin = new Penguin();
        Bird strauss = new Strauss();
        Bird swallow = new Swallow();

        Bird[] arrBirds = {penguin, strauss, swallow};

        for (Bird bird : arrBirds){
            bird.move();
            bird.eat();
            bird.live();
        }

    }

}
