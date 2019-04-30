
/**
 * @author Luke Wismer 
 * @version 1.1.1
 */
public class GardenDemo
{
    private VeggieGarden garden;
    private Vegetable vegetable;
    /**
     * Constructor for objects of class GardenDemo
     */
    public GardenDemo()
    {
        garden = new VeggieGarden("Berkley");
    }

    public void gardenDetails()
    {
        garden.printGardenDetails();
    }

    public void sunPlants()
    {
        garden.sunnyPlants();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

    /**
     * adds Vegetable plants to the garden
     */
    public void loadVegetables()
    {
        garden.addVegetable(new Vegetable("Beets", true, 10));
        garden.addVegetable(new Vegetable("Potato", false, 20));
        garden.addVegetable(new Vegetable("Beans", false, 20));
        garden.addVegetable(new Vegetable("Cauliflower", true, 5));
        garden.addVegetable(new Vegetable("Broccoli", true, 5));
        garden.addVegetable(new Vegetable("Turnip", true, 10));

    }
}
