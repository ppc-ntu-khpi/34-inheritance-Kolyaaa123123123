package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;


/** 
 *
 * It is a default constructor. 
 *
 */
    public Animal() { 

        name = "name";
        weight = 100;
    }


/** 
 *
 * Method for eat
 *
 */
    public void eat() { 

        System.out.println("Animal eating ...");
    }


/** 
 *
 * Method for speak
 *
 */
    public void speak() { 

        System.out.println("Animal speak...");
    }


/** 
 *
 * Method for sleep
 *
 */
    public void sleep() { 

        System.out.println("Animal sleep!!!");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "My animal:\n" + "name: " + name + "\nweight: " + weight;
    }
}

