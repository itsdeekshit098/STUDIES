class consoverloading {
    int a = 0, b = 0;

    consoverloading() {
        System.out.println("innerclass=" + (a + b));
    }

    consoverloading(int k, int l) {
        a = k;
        b = l;
        System.out.println(a + b);
    }

}

public class constructoroverloading {
    public static void main(String args[]) {
        System.out.println("defalut constructor");
        // creating obj of consoverloading
        // constructors are called during creation of objects
        // methods are called using objects
        consoverloading obj = new consoverloading();
        System.out.println("parameterized constructor");
        consoverloading obj1 = new consoverloading(1, 2);

    }
}