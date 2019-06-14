public class Split {



    /**
     * Create a String named 'ret' and get the first letter of
     * each word inside the string.
     * Use String.split() and String.charAt() methods.
     * Find detailed API documentation at the website listed above.

     * Suppose we want have a String "Idol Long Oolong Vertical Europe University Toyota" and we want to extract the
     * first letter of each word in the String and get a new String with "ILOVEUT".
     * You may use the String class's split and charAt methods or other methods that you prefer.
     * You can look up detailed usage documentation here.

     */
    public static String split() {
        String tester = new String("Idol Long Oolong Vertical Europe University Toyota");
        String[] word = tester.split("");
        String s = "";
        for (String t: word){
        s += t.charAt(0);
        }
    System.out.println(s);
    return s;
    }

}