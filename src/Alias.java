//public class Alias {
//    private int int1 = 10;
//    private src.MutablePen pen1 = new src.MutablePen("black");
//
//    public void func(int int2, src.MutablePen pen2) {
//        System.out.print((int1 == int2) + ", " + (pen1 == pen2));
//    }
//
//    public static void main(String[] args) {
//        Alias a = new Alias();
//        int int1 = 10;
//        src.MutablePen pen1 = new src.MutablePen("black");
//
//        a.func(int1, pen1);
//    }
//
////}
//public class Alias {
//    public void func(int i, src.MutablePen pen) {
//        i = i + 1;
//        pen.setColor("red");
//    }
//
//    public static void main(String[] args) {
//        Alias a = new Alias();
//        int int1 = 10;
//        src.MutablePen pen1 = new src.MutablePen("black");
//
//        a.func(int1, pen1);
//        System.out.println(int1 + " " + pen1.getColor());
//    }
//}



class A {
    static int func1(int i) {
        return i;
    }

    static Integer func2(Integer i) {
        return i;
    }

    static Integer func3(Integer i) {
        return new Integer(i);
    }
}

