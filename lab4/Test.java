package ru.mirea.lab4;

public class Test {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Car car = new Car("BMW");
        Human human = new Human("Jack");
        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(human.getName());
    }
}
