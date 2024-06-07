package oops;

public class Interface implements Laptop {
    public static void main(String[] args) {

    }
    @Override
    public void display() {
        System.out.println("Display");
    }

    @Override
    public void keyboard() {
        System.out.println("Keyboard");
    }

    @Override
    public void touchpad() {
        System.out.println("Touchpad");
    }
}

interface Laptop {
    void display();
    void keyboard();
    void touchpad();
}
