import java.util.ArrayList;
import java.util.Random;

/**
 * @author Luke Wismer 
 * @version 1.1.1
 */
public class VeggieGarden
{
    private ArrayList<Vegetable> veggieList;
    private String town;

    /**
     * Constructor for objects of class VeggieGarden
     */
    public VeggieGarden(String town)
    {
        veggieList = new ArrayList<Vegetable>();
        this.town = town;
    }

    /**
     * adds a Vegetable to the veggieList
     */
    public void addVegetable(Vegetable veggie)
    {
        veggieList.add(veggie);
    }

    /**
     * Prints the information on all of the Vegetables 
     * that are in the garden, with each vegetable on 
     * a separate line.
     */
    public void printGardenDetails()
    {
        for(Vegetable vegetable : veggieList)
        {
            System.out.println(vegetable.toString());
        }
    }

    /**
     * Returns an integer which represents the number of plants
     * requiring sun to grow.
     */
    public int sunnyPlants()
    {
        if(isShadePlant == true){
            return plantNum;
        }
        return 0;
    }

    /**
     * Returns a random vegetable
     */
    public Vegetable randomVegetable()
    {
        if(veggieList.size() > 0) {
            Random rand = new Random();
            Vegetable veggie = rand.nextInt(veggieList.size());
            return veggie;
        }
        return null;
    }

    /**
     * Returns the Vegetable with the given name
     */
    public Vegetable findVegetable(String name)
    {
        for(Vegetable vegetable: veggieList)
        {
            if(vegetable.getName() == name) {
                return vegetable;
            }
        }
        System.out.println("No veggies matching that name!");
        return null;
    }
}
