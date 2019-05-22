class Review {
    /**
     * A review, for example of a book or movie.
     */


    // === Class Variables ===


    // The name of the item that this Review is about.
    String item;
    // The numeric rating, between 0 and 100, associated with this Review.
    private int rating;
    // The written component of this review.
    private String text;
    // The number of likes that this review has received.
    private int likes;


    public Review(String item, int rating, String text) {
        this.item = item;
        this.rating = rating;
        this.text = text;
        this.likes = 0;
    }


    public String toString() {
        return this.item + " (" + this.rating + "): " +
                this.text + "; likes = " + this.likes;
    }


    /**
     * Records a like for this Review.
     */
    public void like() {
        this.likes += 1;
    }


    //To make instances of this class comparable, need to do two things.
    // First, we must implement the compareTo method. It's up to us to decide how reviews should compare.
    // Here's one possible implementation, based on ratings:


    /**
     * Compares this object with the specified object for order.
     * <p>
     * Returns a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     *
     * @param other the object to be compared.
     * @return a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     */
    //@Override
    public int compareTo(Review other) {
        if (this.rating < other.rating) {
            return -1;
        } else if (this.rating > other.rating) {
            return 1;
        } else {
            return 0;
        }
    }



}
