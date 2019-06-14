/*
Define a class called HandBag that extends an abstract class Bag with:

    a constructor that takes two parameters that represent this Bag's color (String), and capacity (int)

    an implementation of the method enhance such that this Bag's capacity will be increased by 1 upon calling this method
*/

public class HandBag extends Bag{
    public HandBag(String color, int capacity){
        super(color, capacity);
    }

    @Override
    public void enhance() {
        contents = new String[contents.length + 1];
    }
}
