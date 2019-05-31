// Quest 1 Part: Strings

// Strings are immutable
/* In Java (as in Python), String objects are immutable.
     This means that we can never change a String object once it has been created.
     We can perform operations on Strings, but rather than change an existing String,
     they return a new one (with new address) */


public class Strings {
    public static void main(String[] arg) {
        String s1 = new String("Hello");
        String s2 = "bye";

        //System.out.println(s2);
        // We can't change s1 or s2, but we can make a new String out of them.
        String s3 = s1 + s2;

        // Indexing
        char c = s1.charAt(2);  // In Python: s1[2]


        // Slicing
        s1 = s1.substring(2, 4); // In Python: s1[2:4]


        // Stripping
        s1 = "   Here is my string  .   ";
        s1 = s1.trim();  // In Python: s1.strip()

        // There are many more useful methods, including length, startsWith, and indexOf.
        // For the full list, consult Java's online documentation for Class String.

        StringBuilder sb = new StringBuilder("ban");


        // We don't have to create a new object in order to append;
        // We can modify sb itself.
        sb.append("phone");


        // Some of the other methods allow us to modify a StringBuilder:
        sb.insert(3, "ana");
        sb.setCharAt(3, 'o');
        sb.reverse();

        /* We saw that a String is immutable but a StringBuilder is mutable.
         We can live without StringBuilders if we construct a new String every time we need to make a change.
         But constructing a new object is slower than modifying an existing one. For example: */


        String a = "Joshua";
        String b = "Giraffe";
        a = a + b; // Constructs a new String -- slow.


        StringBuilder e = new StringBuilder("Baby");
        StringBuilder d = new StringBuilder("Beluga");
        e.append(d); // Mutates -- faster.


        String tester = new String("Idol Long Oolong Vertical Europe University Toyota");
        String[] word = tester.split(" ");
        //System.out.println(word);
        String ret = "";
        for (String t : word) {
            ret += t.charAt(0);
        }
        //System.out.println(ret);

        int age = 12;
        System.out.println("Age is " + String.valueOf(age));
        System.out.println("Age is " + age);

    }
    }
