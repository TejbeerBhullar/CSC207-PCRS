/*
    Define a class MutablePen with:

        one private instance variable: color (String)
         a constructor that takes one parameter that represents this MutablePen's color (String)
        getColor(): a getter for the instance variable
        setColor(): a setter for the instance variable
        override method clone() so that it returns a new MutablePen whose color is the same color as this MutablePen

*/

public class MutablePen implements Cloneable{
    private String color;

    public MutablePen(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MutablePen clone(){
        return new MutablePen(this.color);
    }

}

