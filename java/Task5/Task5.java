package java.Task5;

public class Task5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2, 10, "Антон", "Британец", Pet.price.EXPENSIVE);
        Dog dog = new Dog("Дружок", 10, 3, "Катя", "корги", Pet.price.CHEAP);
        Parrot parrot = new Parrot("Джек", 1, 1, "Сева", "Австралия", true);
        cat.walk();
        dog.walk("Саша");
        parrot.fly();
        Pet[] house = new Pet[] {cat, dog, parrot};
        for (int i = 0; i <= 2; i++) {
            if (house[i] instanceof Cat) {
                System.out.println(cat.say());
            }
            if (house[i] instanceof Dog) {
                System.out.println(dog.say());
            }
            if (house[i] instanceof Parrot) {
                System.out.println(parrot.say());
            }
        }
    }
}
