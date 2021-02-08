package test;

import domain.Eagle;

 /**
 * The class for test class Eagle
 */ 
public class TestAnimal {


/** 
 *
 * Method for test Eagle
 *
 * @param args  the args
 */
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

