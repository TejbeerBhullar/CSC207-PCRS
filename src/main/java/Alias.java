//
//public class Alias {
//    private int int1 = 10;
//    private MutablePen pen1 = new MutablePen("black");
//
//    public void func(int int2, MutablePen pen2) {
//        System.out.print((int1 == int2) + ", " + (pen1 == pen2));
//    }
//
//    public static void main(String[] args) {
//        Alias a = new Alias();
//        int int1 = 10;
//        MutablePen pen1 = new MutablePen("black");
//
//        a.func(int1, pen1);
//    }
//
////}
//public class Alias {
//    public void func(int i, MutablePen pen) {
//        i = i + 1;
//        pen.setColor("red");
//    }
//
//    public static void main(String[] args) {
//        Alias a = new Alias();
//        int int1 = 10;
//        MutablePen pen1 = new MutablePen("black");
//
//        a.func(int1, pen1);
//        System.out.println(int1 + " " + pen1.getColor());
//    }
//}
class A {
    void func(double d) {
        System.out.println(d);
    }

    void func1(double d2) {
        System.out.println(d2);
    }
}