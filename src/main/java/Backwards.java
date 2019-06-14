import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class Backwards {

    private int[] A, B;

    public Backwards() {
        A = new int[100]; // Array of length 100
        B = new int[100]; // Array of length 100
    }

    //hidden code fills A

    /**
     * Copies positive elements of A to B, but in reverse order, stopping upon encountering a negative element.
     */


    public void backwardsCopy() {
        int j = 0;
        int i = A.length -1;
        while( i >= 0 ){
            if(A[i]>= 0){
                B[j] = A[i];

            }
            i--;
            j++;
        }
    }

    public void backwardsCopy2() {

        int i = A.length -1;
        while( i >= 0 ){
            if(A[i]>= 0){
                B[i] = A[i];

            }
            i--;

        }}

        public static int[] getArray(int[] v) {
        Random r = new Random();
        int [] array = new int[100];
        int last = 0;
        for (int a = 0; a < array.length/2; a++) {
            last = last - r.nextInt(10) + 1;
            array[a] = last;
        }
        for (int a = 0; a > array.length/2; a--) {
            last = last + r.nextInt(10) + 1;
            array[a] = last;
        }
        v = array;
        return v;
    }
    public static String print(int[] array) {
        String returnString = "";
        if (array.length == 0) {
            returnString += "{ }";
            return returnString;
        } else {
            returnString += "{ ";
            for (int i = 0; i < array.length; i++) {
                returnString += array[i] + ", ";
            }
            returnString += " }";
        }
        return returnString;
    }
    public static void main( String[] arg){

        int[] a = new int[100];
        int[] b = new int[100];
        int[] fl = getArray(a);
        a=fl;
        String q = print(fl);
        System.out.println(q);

        int j = 0;
        int i = a.length -1;
        while( i >= 0 ){
            if(a[i]>= 0){
                System.out.println("a[i]: "+a[i]+", b[j]"+b[j]);
                b[j] = a[i];
                System.out.println("a[i]: "+a[i]+", b[j]"+b[j]);

            }
            i--;
            j++;
        }

        String ef = print(b);
        System.out.println(ef);

    }

}





