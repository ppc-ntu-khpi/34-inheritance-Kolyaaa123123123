package test;

import domain.Eagle;
public class TestAnimal {

    public static void main(String[] args) {
        
        Eagle eagle = new Eagle("Socil Sapsan");
        
        System.out.println(eagle);
        
        eagle.eat();
        eagle.fly();
        eagle.hunt();
        eagle.sleep();
        eagle.speak();
    }
}
