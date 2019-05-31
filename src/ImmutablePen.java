/*
Define a class src.ImmutablePen with:

    one private instance variable: color of pen (String)
    a constructor that has one parameter that represents this src.ImmutablePen's color (String)
    getColor(): a getter for the instance variable
*/


public class ImmutablePen{
    private String colorOfPen;

    public ImmutablePen(String colorOfPen){
        this.colorOfPen = colorOfPen;
    }


    public String getColor(){
        return this.colorOfPen;
    }


}

