import java.util.Arrays;
import java.util.Comparator;

class TextComparator implements Comparator<Review> {



    /**
     * Compares its two arguments for order.
     *
     * Returns a negative integer, zero, or a positive integer
     * as r1 is less than, equal to, or greater than r2 in terms
     * of length of text.
     *
     * @param r1 the first Review to compare
     * @param r2 the second Review to compare
     * @return a negative integer, zero, or a positive integer
     *      as r1 is less than, equal to, or greater than r2
     */
    @Override
    public int compare (Review r1, Review r2) {
        return r1.getText().length() - r2.getText().length();
    }



    public static void main(String[] args) {
        Review r1 = new Review("Emoji Movie", 10,
                "Cinematic malware");
        Review r2 = new Review("Dunkirk", 95,
                "Gifted ensemble cast and masterful direction");
        Review r3 = new Review("Spider Man: Homecoming", 95,
                "A fun adventure");
        Review r4 = new Review("My Neighbour Totoro", 99,
                "A work of art");
        Review r5 = new Review("Despicable Me3", 60,
                "Zany but scattershot humour");



        Review[] rottenVeg = {r1, r2, r3, r4, r5};
        r1.like();
        r1.like();
        r1.like();
        r4.like();
        r3.like();
        Arrays.sort(rottenVeg, new TextComparator());
        for (int i = 0; i < rottenVeg.length; i++) {
            System.out.println(rottenVeg[i]);
        }
    }
}

