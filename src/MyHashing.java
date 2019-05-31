//
//        Add a method called hash so that
//        1) if it takes String as an argument, it returns the sum of the ASCII values of the characters in the String.
//        2) if it takes int as an argument, it stores the input value into seed and returns the previous value of seed.

public class MyHashing {
    private int seed = 100;

    public MyHashing(){}
    public MyHashing(int i){
        seed = i;
    }

    public int hash(String a){
            int ret = 0;
           char presentcharacter;
            for (int i = 0; i < ((String) a).length(); i++){
                presentcharacter = ((String) a).charAt(i);
                ret += (int) presentcharacter;
                    }
                return ret; }

    public int hash(int a){
        int ret = seed;
        seed = a;
        return ret;
        }
}
