
public class methodoverloadinglab {
    void method1(int x, int y) {
        System.out.println("mssg from method 1");
        System.out.println("sum of two numbers is " + (x + y));
    }

    void method1(int x, int y, int z) {
        System.out.println("mssg from 2nd method");
        System.out.println("sum of three numbers is " + (x + y + z));
    }

    public static void main(String args[]) {
        methodoverloadinglab obj1 = new methodoverloadinglab();
        obj1.method1(1, 2, 3);
        System.out.println("\n");
        obj1.method10(1, 2);
    }

}
