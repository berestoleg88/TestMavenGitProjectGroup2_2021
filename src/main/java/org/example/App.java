package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hobby project");
        Hobby hobby1 = new Hobby();
        hobby1.setName("football");
        System.out.println("hobby1: " + hobby1.getName());

        Hobby hobby2 = new Hobby("reading", 20);
        System.out.println("hobby2: name: " + hobby1.getName() + "; hours: " + hobby2.getHoursPerWeek());
    }
}
