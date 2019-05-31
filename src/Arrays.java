public class Arrays {

  public static void main(Arrays[] arrays){

  int[][] table;
// The type of table is int[][] ("int array array", or "array of int arrays").
// At this point, we have merely a variable with space for a reference, nothing more.
      table = new int[50][3];
// Now we have an array of 50 elements, each of which refers to
// an array of 3 elements, each of which can store an int.
// Variable `table` refers to the whole thing.
// We have to keep the two different dimensions straight.
// This is legal:
  table[49][2] = 123;
// This is not:
    table[2][49] = 123;

      table = new int[50][];
// Now we have an array of 50 elements, each of which can refer to
// an int array, but doesn't yet.
      for (int i = 0; i < 50; i++) {
          table[i] = new int[3];
      }
// Now we are in the same situation we created above by
// constructing new int[50][3].

      // This decoupling of the two sizes gives us the latitude to make irregularly shaped multi-dimensional arrays:


      int[][] irregular;
      irregular = new int[3][];
      irregular[0] = new int[6];
      irregular[1] = new int[99];
      irregular[2] = new int[10];
      irregular[1][8] = 170;




      int[] numbers;
    String house = new String("Hufflepuff");
    int[] number = new int[5];
    Object[] miscellany = new Object[5];
    // We can put a String object into the array.
    miscellany[0] = new String("Songbird");



// Every primitive type has a "wrapper" class. It lets you wrap up a value
// in an object. Perfect for times like this when you need some kind of
// Object rather than a primitive.
    miscellany[1] = new Integer(1872);



// If we have a class called src.Monster, we can put src.Monster objects in too --
// no problem!
    // miscellany[2] = new src.Monster("Fred");



// Although it has some special syntax, an array is still a kind of Object,
// so it satisfies the type requirements of our array of Objects too.
    miscellany[3] = new int[50];

      int[] tweedle = new int[20];
      int[][] dee = new int[5][10];
      String[] dum = new String[22];

      tweedle[1] = 1;
      tweedle[2] = 100;
      dum[0] = new String("Hi");

      dee[0][0] = 0;
      dee[0][1] = 1;
      dee[0][2] = 2;

  }


}
