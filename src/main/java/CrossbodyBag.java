/*
Define a class called CrossbodyBag that extends an abstract class Bag with:

Done: one private instance variable:

    - number of straps of a bag (int)

Done: a constructor that takes three parameters that represent this Bag's color (String), capacity (int), and the number of straps (int)

Done: a getter for the instance variable called getNumberOfStraps

an implementation of the method enhance such that this Bag's capacity will be increased by 2 upon calling this method

*/

public class CrossbodyBag extends Bag{
    private int numberOfStraps;

    public CrossbodyBag(String color, int capacity, int numberOfStraps){
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumOfStraps() {
        return numberOfStraps;
    }

    @Override
    public void enhance() {
        contents = new String[contents.length + 2];
    }
}
