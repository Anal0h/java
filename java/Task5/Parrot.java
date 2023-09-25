package java.Task5;

public class Parrot extends Pet {
    private String country;
    private boolean document;

    public Parrot(String name, int weight, int age, String owner, String country, boolean document) {
        super(name, weight, age, owner);
        this.country = country;
        this.document = document;
    }

    public void fly() {
        int time = (int) (Math.random() * (60)) + 1;
        System.out.println("Попугай " + this.getName() + " улетел, но обещал вернуться через " + time + " минут.");
    }

    @Override
    public String say() {
        return "Привет, я попугай " + this.getName() + ".";
    }
}
