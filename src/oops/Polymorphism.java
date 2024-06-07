package oops;

public class Polymorphism {
    public static void main(String[] args) {
        Student student = new Student();
        student.walk();
        student.walk(10);
        student.walk("North");

    }
}

class Student {
    void walk() {
        System.out.println("Person is walking");
    }
    void walk(int steps) {
        System.out.println("Person is walking " + steps + " steps");
    }
    void walk(String direction) {
        System.out.println("Person is walking in " + direction + " direction");
    }
}