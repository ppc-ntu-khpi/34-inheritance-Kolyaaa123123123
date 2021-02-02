package domain;

public class Eagle extends Bird {

    private String type;

    public Eagle(String name, int weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public Eagle() {
        this("Socil", 100, "Sapsan");
    }
    
    public Eagle(String name) {
        this(name, 100, "Sapsan");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\ntype:" + type + "\n";
    }
    
    @Override
    public void speak() {
        System.out.println("Shhh!");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunting...");
    }

    @Override
    public void fly() {
        System.out.println("Eagle fly...");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eat...");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle slepp...");
    }
    
    
}

