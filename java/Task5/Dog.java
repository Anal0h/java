package Task5;

import Task5.Cat;

public class Dog extends Pet {
    private String breed;
    private Cat.Price food;

    public Dog(String name, int weight, int age, String owner, String breed, Cat.Price food) {
        super(name, weight, age, owner);
        this.breed = breed;
        this.food = food;
    }

    public void walk() {
        System.out.println("Пёс " + this.getName() + " гуляет со своим хозяином.");
    }

    public void walk(String name) {
        System.out.println("Пёс " + this.getName() + " гуляет с человеком по имени " + name + ".");
    }

    @Override
    public String say() {
        return "Привет, я пёс " + this.getName() + ".";
    }
}