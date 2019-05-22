/* Create a Car class.
It should have for instance variables:

a private String named brandName

a private int named capacity.


It should have a constructor that has a String parameter brandName and an int parameter capacity.
It should set the two parameters to the corresponding attributes in the class.
Lastly, this class should have the following additional getters and setters:

getBrandName that returns the brandName

setBrandName that takes a String parameter newBrandName and sets the brandName to newBrandName.

getCapacity that returns the capacity

setCapacity that takes an int parameter newCapacity and sets the capacity to newCapacity

*/
public class Car {
    private String brandName;
    private int capacity;

    public Car(String brandName, int capacity){
        this.brandName = brandName;
        this.capacity = capacity;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String newBrandName) {
        this.brandName = newBrandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}



