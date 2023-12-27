public class overriding {
    public static void hi(int a, int b) {
        System.out.println("1st method is executed");

    }

    public static void hi(int a, int b) {
        System.out.println("2nd method is executed ");
    }

    public static void main(String args[])
    {
        hi(1, 2);

    }
}
