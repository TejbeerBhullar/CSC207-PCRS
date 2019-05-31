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

