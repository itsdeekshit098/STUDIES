public class exponoverwriting {
    public static void hi(int a, int b) {
        System.out.println("1");
    }

    public static void hi(int a, float b) {
        System.out.println("2");
    }

    public static void main(String args[]) {
        hi(1, 1.1);
    }

}
