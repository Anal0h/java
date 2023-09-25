package java.Task5;

public class Pet {
    private String name;
    private int weight;
    private int age;
    private String owner;

    public Pet(String name, int weight, int age, String owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public String say() {
        return "Привет, я " + this.name + ".";
    }

    public String getName() {
        return this.name;
    }

    public enum price {
        CHEAP, EXPENSIVE;
    }
}
