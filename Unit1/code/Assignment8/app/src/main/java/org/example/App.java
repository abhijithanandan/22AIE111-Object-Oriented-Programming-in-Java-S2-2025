package org.example;

public class App {

    public static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }
    }

    public void changePrimitive(int num) {
        // This change will NOT affect the original variable outside.
        num = 999;
    }

    public void changeReference(Person person) {
        // This modifies the object that person references, so it WILL persist.
        person.name = "Changed Name";
    }

    public static void main(String[] args) {
        App app = new App();

        // Demonstrate with primitive
        int myNumber = 10;
        System.out.println("Before changePrimitive: " + myNumber);
        app.changePrimitive(myNumber);
        System.out.println("After changePrimitive: " + myNumber);

        // Demonstrate with reference
        Person bob = new Person("Bob");
        System.out.println("Before changeReference: " + bob.name);
        app.changeReference(bob);
        System.out.println("After changeReference: " + bob.name);
    }
}

