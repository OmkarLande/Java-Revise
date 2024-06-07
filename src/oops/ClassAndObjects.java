package oops;

public class ClassAndObjects {
    public static void main(String[] args) {
        //Object
        Person p1 = new Person();
        p1.name = "Omkar";
        p1.age = 22;
        p1.display();
        p1.walk();
    }
}

//class
class Person {
    // instance variables
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
    void walk() {
        System.out.println(name + " is walking");
    }
}
