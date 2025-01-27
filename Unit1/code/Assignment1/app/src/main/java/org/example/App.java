package org.example;

public class App {

    /**
     * Returns the string "Hello World!".
     *
     * @return A greeting message.
     */
    public String sayHello() {
        return "Hello World!";

    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.sayHello());
    }
}
