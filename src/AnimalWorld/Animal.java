package AnimalWorld;

/**
 * Animal is the parent class of all creatures: Mammal
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public abstract class Animal implements Organism {

    /**
     * what the animal eats: Herbivore, Carnivore, Omnivore
     */
    protected EatingStrategy eatingStrat;
    
    /**
     * how the animal moves: Fight, Flight, Burrow, Random
     */
    protected MovementStrategy moveStrat;
    
    /**
     * how the animal breeds
     */
    protected OutCrossing outCrossingStrat;
    
    /**
     * the higher the number the bigger the animal
     */
    protected int size;
    
    /**
     * number is how many squared that the animal can move
     */
    protected int movementSpeed;
    
    /**
     * array of size 2, with 0 being the x coordinate and 1 being the y coordinate
     */
    protected int[] position;
    
    /**
     * 0 is not a cannibal, 1 is a cannibal
     */
    protected boolean isCannibal;
    
    /**
     * 0 can not eat larger creatures, 1 can eat larger
     */
    protected boolean canEatLarger;
    
    /**
     * the name of this Animal
     */
    protected String name;
    
    /**
     * 0 is a female, 1 is male
     */
    protected int gender;
    
    /**
     * the body parts that make up the Animal
     */
    protected BodyComponent body;
    
    /**
     * how much damage the Animal can deal
     */
    protected int damageConstant;
    
    /**
     * how much damage the Animal can take
     */
    protected int damageCapacity;
    
    /**
     * how much damage the Animal has taken
     */
    protected int markedDamage;

    /**
     * Animal constructor
     * 
     * @param aniName      The name of the animal
     * @param attributes   The x,y position of the Animal
     * @param initialBody  The starting body of the animal
     */
    public Animal(String aniName, int[] attributes, BodyComponent initialBody) {
        position = new int[2];
        position[0] = attributes[0];
        position[1] = attributes[1];

        if (attributes[2] == 1) {
            moveStrat = new Fight();
        } else if (attributes[2] == 2) {
            moveStrat = new Flight();
        } else {
            moveStrat = new RandomMovement();
        }

        if (attributes[3] == 1) {
            eatingStrat = new Carnivore();
            isCannibal = true;
        } else if (attributes[3] == 2) {
            eatingStrat = new Herbivore();
            isCannibal = false;
        } else {
            eatingStrat = new Omnivore();
            isCannibal = false;
        }
        
        body = initialBody;
        size = body.getSize();
        damageCapacity = size/10;
        damageConstant = size/30;
        markedDamage = 0;

        movementSpeed = attributes[4];
        
        gender = attributes[5];

    }

    /**
     * Checks to see if the animal ate this turn
     * 
     * @return returns 0 if it failed to eat this turn and 1 if it did eat this turn
     */
    int eat() //returns 0 if it did not eat and 1 if it did eat
    {
        return 0;
    }

    /**
     * Moves the Animal towards its current objective
     * 
     */
    void move() {

    }

    /**
     * Goes through the sequence of events that make up a turn
     */
    void takeTurn() {

    }

    @Override
    public int[] getPosition() {
        return position;
    }

    @Override
    public int getX() {
        return position[0];
    }

    @Override
    public int getY() {
        return position[1];
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof Animal)) return false;
        Animal otherAnimal = (Animal) o;
        if(this.getName().equals(otherAnimal.getName()))
            return true;
        else return false;
    }

    abstract int hide(); //returns a 0 if unable to hide and a 1 if hide was successful
}
