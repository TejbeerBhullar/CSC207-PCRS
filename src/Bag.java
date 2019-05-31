/*

Add a method called addItem that takes a String and appends it to the array of String which represents contents of this Bag.
 If this Bag is full (i.e., the number of contents in this Bag is equal to this Bag's capacity), return the input String.
 Otherwise, return null, which means the item has been added to this Bag.

Add a method called popItem, which removes and returns the last item added to this Bag. If this Bag is empty, return null.

Done : Add an abstract method called enhance that takes no arguments and returns nothing.
 This method increases the capacity of this Bag. Child classes are responsible for the implementation.
*/

class Bag{
    private String color;
    private int capacity;
    private int numberOfContents = 0;
     String[] contents ;//= new String[capacity];

    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.contents = new String[capacity];
    }

    public String getColor(){return this.color;}
    public int getNumberOfContents(){return numberOfContents;}
    public int getCapacity(){return capacity;}
    public void setColor(String newcolor){color = newcolor;}


    public Object addItem(String item){
                                                      //  System.out.println("number of contents: "+numberOfContents +" capacity:"+capacity +" item:"+item);
        if(numberOfContents >= capacity){               //System.out.println("\n entered if statement" );// if the bag is full
            return item;}
        else{                                          //System.out.println("entered else statement" ); // if the bag is not full   hackerrank
             contents[numberOfContents] = item ;
            numberOfContents++;
            return null;
        }
    }

    public Object popItem(){
        if (contents == null){return null; }
        else if (contents.length == 0){return null;}
        else{
            numberOfContents--;
            int i = contents.length -1 ;
            String item = contents[i];
            while ( contents[i] == null | i > 0 ){
                i--;
                item = contents[i];
            }

            contents[i] = null;
            return item;
        }
    }

    public void enhance(){}

    public static void print(String[] name){
        String ret = "{";
        for(int i=0; i<name.length ; i++){
            ret += " "+name[i] +",";
        }
        ret = ret.substring(0,ret.length()-1);
        ret += " }";
        System.out.println(ret);
    }


    public static void main(String[] arg){
        // Test for addItem
    Bag b1 = new Bag("red", 5);
    print(b1.contents);                         // Starting with empty Array
    b1.addItem("Shirts");
    System.out.println(b1.numberOfContents);
    print(b1.contents);
    b1.popItem();
    print(b1.contents);

    }

}



