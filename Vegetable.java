
/**
 * @author Luke Wismer 
 * @version 1.1.1
 */
public class Vegetable
{
    private String name; //name of plant
    private boolean isShadePlant; //true if a shade plant
    private int plantNum; //number of plants

    /**
     * Constructor for objects of class Vegetable
     */
    public Vegetable(String name, boolean isShadePlant, int plantNum)
    {
        this.name = name;
        this.isShadePlant = isShadePlant;
        this.plantNum = plantNum;
    }

    /**
     * returns a string with the details of the Vegetable
     */
    public String toString()
    {
        if(isShadePlant)
        {
            return "name: " + name + ", shade plant: yes" + ", number of plants: " + plantNum;
        }
        else
        {
            return "name: " + name + ", shade plant: no" + ", number of plants: " + plantNum;
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean isShadePlant()
    {
        return isShadePlant;
    }
    
    public int numberOfPlants()
    {
        return plantNum;
    }
}

