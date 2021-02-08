package domain;


 /**
 * The class Eagle extends Bird
 */ 
public class Eagle extends Bird {

    private String type;


/** 
 *
 * It is a constructor 
 *
 * @param name  the name
 * @param weight  the weight
 * @param type  the type
 */
    public Eagle(String name, int weight, String type) { 

        this.name = name;
        this.weight = weight;
        this.type = type;
    }


/** 
 *
 * It is a default constructor
 *
 */
    public Eagle() { 

        this("Socil", 100, "Sapsan");
    }
    

/** 
 *
 * It is a constructor
 *
 * @param name  the name
 */
    public Eagle(String name) { 

        this(name, 100, "Sapsan");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\ntype:" + type + "\n";
    }
    
    @Override

/** 
 *
 * Method for speak
 *
 */
    public void speak() { 

        System.out.println("Shhh!");
    }

    @Override

/** 
 *
 * Method for hunt
 *
 */
    public void hunt() { 

        System.out.println("Eagle hunting...");
    }

    @Override

/** 
 *
 * Method for fly
 *
 */
    public void fly() { 

        System.out.println("Eagle fly...");
    }

    @Override

/** 
 *
 * Method for eat
 *
 */
    public void eat() { 

        System.out.println("Eagle eat...");
    }

    @Override

/** 
 *
 * Method for sleep
 *
 */
    public void sleep() { 

        System.out.println("Eagle slepp...");
    }
    
    
}

