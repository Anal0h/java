package java.Task5;

public class Cat extends Pet {
    private String breed;
    private Pet.price food;

    public Cat(String name, int weight, int age, String owner, String breed, Pet.price food) {
        super(name, weight, age, owner);
        this.breed = breed;
        this.food = food;
    }

    public void walk() {
        System.out.println("Кот " + this.getName() + " гуляет со своим хозяином.");
    }

    public void walk(String name) {
        System.out.println("Кот " + this.getName() + " гуляет с человеком по имени " + name + ".");
    }

    @Override
    public String say() {
        return "Привет, я кот " + this.getName() + ".";
    }
}
