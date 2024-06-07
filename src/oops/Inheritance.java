package oops;

public class Inheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar(200);
        sc.Speed = 300;
        sc.headLights = 4;
        sc.doors = 4;
        sc.wheels = 4;
        sc.display();
        sc.displayDoors();
        sc.displaySpeed();
    }
}

class Vehicle {
    int wheels;
    int headLights;

    Vehicle(int wheels) {
        this.wheels = wheels;
        headLights = 2;
    }
    void display() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Headlights: " + headLights);
    }
}

class Car extends Vehicle {
    int doors;
    Car(int wheels, int doors) {
        super(wheels);
        this.doors = doors;
    }
    void displayDoors(){
        System.out.println("Doors: " + doors);
    }
}

class SportsCar extends Car {
    int Speed;
    SportsCar(int Speed) {
        super(4, 2);
        this.Speed = Speed;
    }
    void displaySpeed(){
        System.out.println("Speed: " + Speed);
    }
}