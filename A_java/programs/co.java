public class co {
    co() {
        System.out.println("first constructor");
    }

    co(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        co obj1 = new co(1, 2);
        co obj2 = new co();

    }
}
