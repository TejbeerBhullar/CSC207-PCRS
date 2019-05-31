public class Backwards {

    private int [] A, B;

    public Backwards() {
        A = new int [100]; // Array of length 100
        B = new int [100]; // Array of length 100
    }

    //hidden code fills A

    /**
     * Copies positive elements of A to B, but in reverse order, stopping upon encountering a negative element.
     */
    // Copy the positive elements of A to B, but in reverse order, stopping upon encountering a negative element.

    public void backwardsCopy() {
      int i = A.length -1;
      int j = 0;
      while(i >= 0){
          if (A[i] < 0 ){
              B[j] = A[i];
              j++;}
              i--;      }
                                }
}

