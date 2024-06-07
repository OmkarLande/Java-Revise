package oops;

public class Keywords {
    public static void main(String[] args) {
        Animal animal = new Animal("Bulldog", 4);
        animal.eat();
        System.out.println("Animal age: "+animal.age);
        System.out.println("Animal color: "+animal.color);

    }
}

class Animal extends Person {
    //static keyword
    //it is used to declare a static variable
    static String name = "Dog";
    //final keyword
    //it is used to declare a constant variable
    final String color = "Black";

    //synchronized keyword
    //it is used to make a method thread-safe
    synchronized void eat() {
        System.out.println("Eating...");
    }

    //volatile keyword
    //it is used to declare a volatile variable
    volatile int age = 10;

    String breed;
    int legs;

    public Animal() {
        System.out.println("Animal constructor"+ name);
    }

    public Animal(String breed, int legs) {
        //super keyword
        //it is used to refer to the parent class object
        super();
        this.walk();

        //this keyword
        //it is used to refer to the current object
        this.breed = breed;
        this.legs = legs;
    }
}