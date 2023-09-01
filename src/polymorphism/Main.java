package polymorphism;

public class Main {

    public static void main(String[] args) {

        Bird p = new Penguin();
        Bird s = new Strauss();
        Bird sw = new Swallow();

        Bird[] arr = {p, s, sw};

        for (Bird temp : arr) {
            temp.move();
        }
    }
}
