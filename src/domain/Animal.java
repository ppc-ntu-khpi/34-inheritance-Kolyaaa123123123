package domain;

public class Animal {

    protected String name;

    protected int weight;

    public Animal() {
        name = "name";
        weight = 100;
    }

    public void eat() {
        System.out.println("Animal eating ...");
    }

    public void speak() {
        System.out.println("Animal speak...");
    }

    public void sleep() {
        System.out.println("Animal sleep!!!");
    }

    @Override
    public String toString() {
        return "My animal:\n" + "name: " + name + "\nweight: " + weight;
    }
}
